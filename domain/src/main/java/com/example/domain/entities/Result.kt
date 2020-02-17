package com.example.domain.entities

sealed class Result {
    data class Success(val result: Result)
    data class Fail(val result: Result)
}

