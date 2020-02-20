package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository

interface SaveArticleUseCase : BaseUseCase<Article, Boolean>

class SaveArticleUseCaseImpl(private val articleRepository: ArticleRepository) :
    SaveArticleUseCase {

    override suspend fun execute(param: Article): Boolean {
        return articleRepository.saveArticle(param)
    }
}
