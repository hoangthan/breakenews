package com.example.data.dataSource.local

import com.example.data.entities.ArticleEntity

interface LocalDataSource {
    fun saveArticle(articleEntity: ArticleEntity): Boolean
    fun deleteArticle(id: String): Boolean
    fun searchArticle(keyword: String): List<ArticleEntity>
}

class LocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : LocalDataSource {

    override fun saveArticle(articleEntity: ArticleEntity): Boolean {
        return articleDAO.insertArticle(articleEntity)
    }

    override fun deleteArticle(id: String): Boolean {
        return articleDAO.deleteArticle(id)
    }

    override fun searchArticle(keyword: String): List<ArticleEntity> {
        return articleDAO.searchArticle(keyword)
    }
}
