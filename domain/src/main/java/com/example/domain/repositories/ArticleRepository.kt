package com.example.domain.repositories

import com.example.domain.entities.Article
import com.example.domain.usecases.SearchArticleUsecase.Param

interface ArticleRepository {
    fun getHeadlineNews(): List<Article>
    fun searchArticle(param: Param): List<Article>
}
