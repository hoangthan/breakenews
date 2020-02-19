package com.example.domain.entities

data class Article(
    val author: String?,
    val content: String,
    val description: String,
    val publishedAt: String,
    val articleSource: ArticleSource,
    val title: String,
    val url: String,
    val urlToImage: String
) : DomainModel()
