package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository

class GetHeadlineNewsUsecase(private val articleRepository: ArticleRepository) :
    BaseUseCaseWithoutParam<List<Article>> {
    override fun execute(): List<Article> {
        return articleRepository.getHeadlineNews()
    }
}