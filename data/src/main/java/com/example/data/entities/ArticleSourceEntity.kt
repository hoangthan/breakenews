package com.example.data.entities

import androidx.room.Entity

@Entity(tableName = ArticleSourceEntry.TABLE_NAME)
data class ArticleSourceEntity(
    val id: String?,
    val name: String
) : EntityModel()

object ArticleSourceEntry {
    const val TABLE_NAME = "table_article_source"
}
