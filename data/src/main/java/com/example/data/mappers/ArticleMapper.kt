package com.example.data.mappers

import com.example.data.entities.ArticleEntity
import com.example.domain.entities.Article
import com.example.domain.mappers.Mapper

class ArticleMapper(
    private val articleSourceMapper: ArticleSourceMapper
) : Mapper<Article, ArticleEntity> {
    override fun mapToDomain(param: ArticleEntity): Article {
        return Article(
            author = param.author,
            content = param.content,
            description = param.description,
            publishedAt = param.publishedAt,
            articleSource = articleSourceMapper.mapToDomain(param.articleSource),
            title = param.title,
            url = param.url,
            urlToImage = param.urlToImage
        )
    }

    override fun mapToEntity(param: Article): ArticleEntity {
        return ArticleEntity(
            author = param.author,
            content = param.content,
            description = param.description,
            publishedAt = param.publishedAt,
            articleSource = articleSourceMapper.mapToEntity(param.articleSource),
            title = param.title,
            url = param.url,
            urlToImage = param.urlToImage
        )
    }
}
