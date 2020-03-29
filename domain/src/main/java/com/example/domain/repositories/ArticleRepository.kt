package com.example.domain.repositories

import com.example.domain.entities.Article
import com.example.domain.usecases.DeleteArticleUseCaseImpl
import com.example.domain.usecases.GetHeadlineArticleImpl
import com.example.domain.usecases.LoadMoreArticleUseCaseImpl
import com.example.domain.usecases.SearchArticleUseCaseImpl

interface ArticleRepository {
    suspend fun searchArticle(param: SearchArticleUseCaseImpl.Param): List<Article>
    suspend fun saveArticle(article: Article): Boolean
    suspend fun deleteArticle(param: DeleteArticleUseCaseImpl.Param): Boolean
    suspend fun loadMoreArticle(param: LoadMoreArticleUseCaseImpl.Param): List<Article>
    suspend fun getHeadlineArticle(param: GetHeadlineArticleImpl.Param): List<Article>
}
