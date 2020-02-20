package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository

interface LoadMoreArticleUseCase : BaseUseCase<LoadMoreArticleUseCaseImpl.Param, List<Article>>

class LoadMoreArticleUseCaseImpl(private val articleRepository: ArticleRepository) :
    LoadMoreArticleUseCase {

    override suspend fun execute(param: Param): List<Article> {
        return articleRepository.loadMoreArticle(param)
    }

    data class Param(
        val page: Int = 1
    )
}
