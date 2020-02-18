package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository

class SearchArticleUseCase(private val articleRepository: ArticleRepository) :
    BaseUseCase<SearchArticleUseCase.Param, List<Article>> {

    override fun execute(param: Param): List<Article> {
        return articleRepository.searchArticle(param)
    }

    data class Param(
        val keyword: String,
        val pageSize: Int = 20,
        val page: Int = 1
    )
}
