package com.example.data.repositories

import com.example.data.dataSource.LocalDataSource
import com.example.data.dataSource.RemoteDataSource
import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository
import com.example.domain.usecases.SearchArticleUseCase

class ArticleRepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : ArticleRepository {

    override fun getHeadlineNews(): List<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun searchArticle(param: SearchArticleUseCase.Param): List<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveArticle(article: Article): Boolean {
        return localDataSource.saveArticle(article)
    }

    override fun deleteArticle(id: String): Boolean {
        return localDataSource.deleteArticle(id)
    }
}
