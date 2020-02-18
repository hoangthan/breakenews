package com.example.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = ArticleEntry.TABLE_NAME)
data class ArticleEntity(
    @PrimaryKey(autoGenerate = true)
    val article_id: String,
    val article_type: String,
    val images: String,
    val lead: String,
    val meta_post: String,
    val share_url: String,
    val title_format: String
) : EntityModel()

object ArticleEntry {
    const val TABLE_NAME = ""
}