package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository
import javax.inject.Inject

interface SearchArticleUseCase : BaseUseCase<SearchArticleUseCaseImpl.Param, List<Article>>

class SearchArticleUseCaseImpl @Inject constructor(private val articleRepository: ArticleRepository) :
    SearchArticleUseCase {

    override suspend fun execute(param: Param): List<Article> {
        return articleRepository.searchArticle(param)
    }

    data class Param(
        val keyword: String,
        val language: String,
        val category: String,
        val sortBy: String,
        val sources: String,
        val pageSize: Int,
        val page: Int
    )
}
