package com.example.data.repositories

import com.example.data.dataSource.local.LocalDataSource
import com.example.data.dataSource.remote.RemoteDataSource
import com.example.data.entities.ArticleEntity
import com.example.domain.entities.Article
import com.example.domain.mappers.Mapper
import com.example.domain.repositories.ArticleRepository
import com.example.domain.usecases.DeleteArticleUseCaseImpl
import com.example.domain.usecases.LoadMoreArticleUseCaseImpl
import com.example.domain.usecases.SearchArticleUseCaseImpl

class ArticleRepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper<Article, ArticleEntity>
) : ArticleRepository {

    override fun searchArticle(param: SearchArticleUseCaseImpl.Param): List<Article> {
        val keyword = param.keyword
        return localDataSource.searchArticle(keyword).map {
            mapper.mapToDomain(it)
        }
    }

    override fun saveArticle(article: Article): Boolean {
        val articleEntity = mapper.mapToEntity(article)
        return localDataSource.saveArticle(articleEntity)
    }

    override fun deleteArticle(param: DeleteArticleUseCaseImpl.Param): Boolean {
        val id = param.id
        return localDataSource.deleteArticle(id)
    }

    override fun loadMoreArticle(param: LoadMoreArticleUseCaseImpl.Param): List<Article> {
        val page = param.page
        return remoteDataSource.loadMoreArticle(page).map { mapper.mapToDomain(it) }
    }
}
