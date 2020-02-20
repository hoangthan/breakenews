package com.example.data.repositories

import com.example.data.dataSource.local.ArticleDAO
import com.example.data.dataSource.remote.ArticleApi
import com.example.data.entities.ArticleEntity
import com.example.domain.entities.Article
import com.example.domain.mappers.Mapper
import com.example.domain.repositories.ArticleRepository
import com.example.domain.usecases.DeleteArticleUseCaseImpl
import com.example.domain.usecases.GetHeadlineArticleImpl
import com.example.domain.usecases.LoadMoreArticleUseCaseImpl
import com.example.domain.usecases.SearchArticleUseCaseImpl

class ArticleRepositoryImpl(
    private val articleApi: ArticleApi,
    private val articleDAO: ArticleDAO,
    private val mapper: Mapper<Article, ArticleEntity>
) : ArticleRepository {

    override suspend fun searchArticle(param: SearchArticleUseCaseImpl.Param): List<Article> {
        return articleApi.seacrhArticle(
            keyword = param.keyword,
            language = param.language,
            sortBy = param.sortBy,
            page = param.page,
            pageSize = param.pageSize
        ).map { mapper.mapToDomain(it) }
    }

    override suspend fun saveArticle(article: Article): Boolean {
        val articleEntity = mapper.mapToEntity(article)
        return articleDAO.insertArticle(articleEntity)
    }

    override suspend fun deleteArticle(param: DeleteArticleUseCaseImpl.Param): Boolean {
        val articleId = param.id
        return articleDAO.deleteArticle(articleId)
    }

    override suspend fun loadMoreArticle(param: LoadMoreArticleUseCaseImpl.Param): List<Article> {
        return articleApi.loadMoreArticle().map { mapper.mapToDomain(it) }
    }

    override suspend fun getHeadlineArticle(param: GetHeadlineArticleImpl.Param): List<Article> {
        return articleApi.getTopHeadLineNews(
            country = param.country,
            category = param.category,
            pageSize = param.pageSize,
            page = param.page
        ).map { mapper.mapToDomain(it) }
    }
}
