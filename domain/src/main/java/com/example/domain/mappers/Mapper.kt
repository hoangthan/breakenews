package com.example.domain.mappers

interface Mapper<Domain, Entity> {
    fun mapToDomain(param: Entity): Domain
    fun mapToEntity(param: Domain): Entity
}
