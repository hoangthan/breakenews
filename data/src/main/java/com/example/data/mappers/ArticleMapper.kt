package com.example.data.mappers

import com.example.data.entities.ArticleEntity
import com.example.domain.entities.Article
import com.example.domain.mappers.Mapper

class ArticleMapper : Mapper<Article, ArticleEntity> {
    override fun mapToDomain(param: ArticleEntity): Article {
        return Article(
            article_id = param.article_id,
            article_type = param.article_type,
            images = param.images,
            lead = param.lead,
            meta_post = param.meta_post,
            share_url = param.share_url,
            title_format = param.share_url
        )
    }

    override fun mapToEntity(param: Article): ArticleEntity {
        return ArticleEntity(
            article_id = param.article_id,
            article_type = param.article_type,
            images = param.images,
            lead = param.lead,
            meta_post = param.meta_post,
            share_url = param.share_url,
            title_format = param.share_url
        )
    }
}
