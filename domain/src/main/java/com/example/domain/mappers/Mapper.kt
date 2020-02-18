package com.example.domain.mappers

interface Mapper<Input, Output> {
    fun mapToDomain(input: Input): Output
    fun mapToDto(output: Output): Input
}