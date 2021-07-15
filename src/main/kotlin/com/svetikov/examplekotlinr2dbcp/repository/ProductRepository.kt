package com.svetikov.examplekotlinr2dbcp.repository

import com.svetikov.examplekotlinr2dbcp.model.Products
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.query.Param

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.util.*
@Repository
interface ProductRepository: ReactiveCrudRepository<Products, UUID> {
    @Query("DELETE FROM products WHERE model = $1")
    fun deleteByModel(model:String):Mono<Products>

    @Query("SELECT * FROM products WHERE model = $1")
    fun findByModel(model: String):Mono<Products>
}