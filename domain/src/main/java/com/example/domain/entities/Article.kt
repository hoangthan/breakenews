package com.example.domain.entities

data class Article(
    val article_id: String,
    val article_type: String,
    val images: String,
    val lead: String,
    val meta_post: String,
    val share_url: String,
    val title_format: String
) : DomainModel()
