package com.example.domain.mappers

interface Mapper<Input, Output> {
    fun mapToDomain(param: Input): Output
    fun mapToEntity(param: Output): Input
}
