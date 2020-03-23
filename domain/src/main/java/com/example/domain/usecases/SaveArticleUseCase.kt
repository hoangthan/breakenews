package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository
import javax.inject.Inject

interface SaveArticleUseCase : BaseUseCase<Article, Boolean>

class SaveArticleUseCaseImpl @Inject constructor(
    private val articleRepository: ArticleRepository
) :
    SaveArticleUseCase {

    override suspend fun execute(param: Article): Boolean {
        return articleRepository.saveArticle(param)
    }
}
