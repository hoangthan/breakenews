package com.example.data.dataSource.remote

import com.example.data.entities.ArticleEntity

interface RemoteDataSource {
    fun loadMoreArticle(page: Int): List<ArticleEntity>
}

class RemoteDataSourceImpl : RemoteDataSource {
    override fun loadMoreArticle(page: Int): List<ArticleEntity> {
        return listOf()
    }
}
