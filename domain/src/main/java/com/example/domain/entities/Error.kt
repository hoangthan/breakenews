package com.example.domain.entities

data class Error(
    val code: Int,
    val message: String? = null,
    val case: Throwable? = null
)
