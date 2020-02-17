package com.example.domain.usecases

import com.example.domain.repositories.ArticleRepository

class GetHeadlineNewsUsecase(private val articleRepository: ArticleRepository) {
    fun invoke() = articleRepository.getHeadlineNews()
}