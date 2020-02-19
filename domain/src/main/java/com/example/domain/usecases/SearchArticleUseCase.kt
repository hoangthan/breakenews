package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository

interface SearchArticleUseCase : BaseUseCase<SearchArticleUseCaseImpl.Param, List<Article>>

class SearchArticleUseCaseImpl(private val articleRepository: ArticleRepository) :
    SearchArticleUseCase {

    override fun execute(param: Param): List<Article> {
        return articleRepository.searchArticle(param)
    }

    data class Param(
        val keyword: String,
        val country: String,
        val category: String,
        val sources: String,
        val pageSize: Int,
        val page: Int
    )
}
