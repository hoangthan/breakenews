package com.example.data.dataSource.local

import com.example.data.entities.ArticleEntity
import com.example.domain.entities.Article
import com.example.domain.mappers.Mapper
import com.example.domain.repositories.ArticleRepository
import com.example.domain.usecases.SearchArticleUseCase

interface LocalDataSource : ArticleRepository

class LocalDataSourceImpl(
    private val mapper: Mapper<Article, ArticleEntity>,
    private val articleDAO: ArticleDAO
) : LocalDataSource {

    override fun getHeadlineNews(): List<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun searchArticle(param: SearchArticleUseCase.Param): List<Article> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveArticle(article: Article): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteArticle(id: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
