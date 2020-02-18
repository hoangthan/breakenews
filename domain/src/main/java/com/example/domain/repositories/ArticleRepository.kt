package com.example.domain.repositories

import com.example.domain.entities.Article
import com.example.domain.usecases.SearchArticleUseCase.Param

interface ArticleRepository {
    fun getHeadlineNews(): List<Article>
    fun searchArticle(param: Param): List<Article>
    fun saveArticle(article: Article): Boolean
    fun deleteArticle(id: String): Boolean
}
