package com.example.data.dataSource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entities.ArticleEntity
import com.example.data.entities.ArticleEntry

@Dao
interface ArticleDAO {

    @Insert
    fun insertArticle(articleEntity: ArticleEntity): Boolean

    @Query("DELETE FROM ${ArticleEntry.TABLE_NAME} WHERE ${ArticleEntry.ID} = :id")
    fun deleteArticle(id: String): Boolean

    @Query("SELECT * FROM ${ArticleEntry.TABLE_NAME} WHERE ${ArticleEntry.TITLE_ARTICLE} LIKE :keyword")
    fun searchArticle(keyword: String): List<ArticleEntity>
}
