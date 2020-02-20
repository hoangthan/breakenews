package com.example.domain.usecases

interface BaseUseCaseWithoutParam<T> {
    fun execute(): T
}

interface BaseUseCase<I, O> {
    suspend fun execute(param: I): O
}
