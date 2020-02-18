package com.example.domain.usecases

interface BaseUseCaseWithoutParam<T> {
    fun execute(): T
}

interface BaseUsecase<I, O> {
    fun execute(param: I): O
}