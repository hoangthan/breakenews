package com.example.data.dataSource.remote

import com.example.data.entities.ArticleEntity
import com.example.data.utils.ApiConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticleApi {

    @GET(ApiConfig.HEAD_LINE_PATH)
    suspend fun getTopHeadLineNews(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int
    ): List<ArticleEntity>

    @GET(ApiConfig.SEARCH_PATH)
    suspend fun searchArticle(
        @Query("q") keyword: String,
        @Query("language") language: String,
        @Query("sortBy") sortBy: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int
    ): List<ArticleEntity>

    suspend fun loadMoreArticle(): List<ArticleEntity>
}