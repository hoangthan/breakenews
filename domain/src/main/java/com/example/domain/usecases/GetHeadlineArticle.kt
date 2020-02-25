package com.example.domain.usecases

import com.example.domain.entities.Article
import com.example.domain.repositories.ArticleRepository
import javax.inject.Inject

interface GetHeadlineArticle : BaseUseCase<GetHeadlineArticleImpl.Param, List<Article>>

class GetHeadlineArticleImpl @Inject constructor(
    private val articleRepository: ArticleRepository
) : GetHeadlineArticle {

    override suspend fun execute(param: Param): List<Article> {
        return articleRepository.getHeadlineArticle(param)
    }

    data class Param(
        val country: String,
        val category: String,
        val pageSize: Int,
        val page: Int
    )
}
