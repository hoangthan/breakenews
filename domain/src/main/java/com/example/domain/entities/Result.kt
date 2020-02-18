package com.example.domain.entities

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Fail<out T>(val error: Error) : Result<T>()
}
