package com.example.data.entities

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = ArticleEntry.TABLE_NAME)
data class ArticleEntity(
    val author: String?,
    val content: String,
    val description: String,
    @PrimaryKey
    @ColumnInfo(name = ArticleEntry.ID)
    val publishedAt: String,
    @Embedded
    val articleSource: ArticleSourceEntity,
    val title: String,
    val url: String,
    val urlToImage: String
) : EntityModel()

object ArticleEntry {
    const val TABLE_NAME = "table_article"
    const val ID = "publishedAt"
}
