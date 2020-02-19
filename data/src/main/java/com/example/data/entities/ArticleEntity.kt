package com.example.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = ArticleEntry.TABLE_NAME)
data class ArticleEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ArticleEntry.ID)
    val article_id: String,
    val article_type: String,
    val images: String,
    @ColumnInfo(name = ArticleEntry.TITLE_ARTICLE)
    val lead: String,
    val meta_post: String,
    val share_url: String,
    val title_format: String,
    val insertedTime: Date? = null
) : EntityModel()

object ArticleEntry {
    const val TABLE_NAME = "table_article"
    const val ID = "id"
    const val TITLE_ARTICLE = "title_article"
}