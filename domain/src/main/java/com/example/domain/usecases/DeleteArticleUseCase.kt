package com.example.domain.usecases

import com.example.domain.repositories.ArticleRepository

interface DeleteArticleUseCase : BaseUseCase<DeleteArticleUseCaseImpl.Param, Boolean>

class DeleteArticleUseCaseImpl(private val articleRepository: ArticleRepository) :
    DeleteArticleUseCase {

    override suspend fun execute(param: Param): Boolean {
        return articleRepository.deleteArticle(param)
    }

    data class Param(
        val id: String
    )
}
