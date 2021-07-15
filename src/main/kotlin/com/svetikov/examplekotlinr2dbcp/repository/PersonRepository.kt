package com.svetikov.examplekotlinr2dbcp.repository

import com.svetikov.examplekotlinr2dbcp.model.Person
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.data.repository.reactive.RxJava2CrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import java.util.*
@Repository
interface PersonRepository:ReactiveCrudRepository<Person,UUID> {
    @Query("SELECT * FROM person")
    fun findAllSummary(): Flux<PersonSummary>
}