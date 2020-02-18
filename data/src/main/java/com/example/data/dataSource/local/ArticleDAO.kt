package com.example.data.dataSource.local

import androidx.room.Dao
import com.example.data.entities.ArticleEntity

@Dao
interface ArticleDAO {
    fun insertArticle(articleEntity: ArticleEntity): Boolean
    fun deleteArticle(id: String): Boolean
    fun searchArticle(): List<ArticleEntity>
}