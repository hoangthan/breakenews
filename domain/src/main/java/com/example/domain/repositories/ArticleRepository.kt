package com.example.domain.repositories

import com.example.domain.entities.Article

interface ArticleRepository {
    fun getHeadlineNews(): List<Article>
    fun searchArticle(keyword: String, page: Int): List<Article>
}
