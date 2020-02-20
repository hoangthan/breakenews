package com.example.data.dataSource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.entities.ArticleEntity

@Database(
    entities = [ArticleEntity::class],
    version = ArticleDatabaseEntry.DB_VERSION,
    exportSchema = false
)

abstract class ArticleDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDAO
}

object ArticleDatabaseEntry {
    const val DB_VERSION = 1
}
