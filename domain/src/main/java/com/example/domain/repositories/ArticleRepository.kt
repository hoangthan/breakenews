package com.example.domain.repositories

import com.example.domain.entities.Article
import com.example.domain.usecases.DeleteArticleUseCaseImpl
import com.example.domain.usecases.LoadMoreArticleUseCaseImpl
import com.example.domain.usecases.SearchArticleUseCaseImpl

interface ArticleRepository {
    fun searchArticle(param: SearchArticleUseCaseImpl.Param): List<Article>
    fun saveArticle(article: Article): Boolean
    fun deleteArticle(param: DeleteArticleUseCaseImpl.Param): Boolean
    fun loadMoreArticle(param: LoadMoreArticleUseCaseImpl.Param): List<Article>
}
