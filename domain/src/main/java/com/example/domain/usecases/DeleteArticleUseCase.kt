package com.example.domain.usecases

import com.example.domain.repositories.ArticleRepository
import javax.inject.Inject

interface DeleteArticleUseCase : BaseUseCase<DeleteArticleUseCaseImpl.Param, Boolean>

class DeleteArticleUseCaseImpl @Inject constructor(
    private val articleRepository: ArticleRepository
) :
    DeleteArticleUseCase {

    override suspend fun execute(param: Param): Boolean {
        return articleRepository.deleteArticle(param)
    }

    data class Param(
        val id: String
    )
}
