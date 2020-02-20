package com.example.data.dataSource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.entities.ArticleEntity
import com.example.data.entities.ArticleEntry

@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticle(articleEntity: ArticleEntity): Boolean

    @Query("DELETE FROM ${ArticleEntry.TABLE_NAME} WHERE ${ArticleEntry.ID} = :id")
    suspend fun deleteArticle(id: String): Boolean

}

