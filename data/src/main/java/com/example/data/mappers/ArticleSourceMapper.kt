package com.example.data.mappers

import com.example.data.entities.ArticleSourceEntity
import com.example.domain.entities.ArticleSource
import com.example.domain.mappers.Mapper

class ArticleSourceMapper : Mapper<ArticleSource, ArticleSourceEntity> {
    override fun mapToDomain(param: ArticleSourceEntity): ArticleSource {
        return ArticleSource(
            id = param.id,
            name = param.name
        )
    }

    override fun mapToEntity(param: ArticleSource): ArticleSourceEntity {
        return ArticleSourceEntity(
            id = param.id,
            name = param.name
        )
    }
}