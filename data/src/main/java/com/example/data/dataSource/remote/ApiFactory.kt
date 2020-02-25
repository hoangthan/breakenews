package com.example.data.dataSource.remote

import com.example.data.utils.ApiConfig
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.run {
            proceed(
                request().newBuilder()
                    .addHeader(ApiConfig.API_HEADER, ApiConfig.API_KEY)
                    .build()
            )
        }
    }
}

object ApiFactory {

    private val okHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(HeaderInterceptor)
        .build()

    val instance: ArticleApi = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(ApiConfig.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()
        .create(ArticleApi::class.java)
}
