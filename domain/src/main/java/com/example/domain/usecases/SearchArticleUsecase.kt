package com.example.domain.usecases

import com.example.domain.repositories.ArticleRepository

class SearchArticleUsecase(private val articleRepository: ArticleRepository) {
    fun invoke(keyword: String, page: Int) = articleRepository.searchArticle(keyword, page)
}