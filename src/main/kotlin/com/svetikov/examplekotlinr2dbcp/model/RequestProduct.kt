package com.svetikov.examplekotlinr2dbcp.model

object RequestProduct {
    data class CreateProduct(
        val name:String,
        val model:String,
        val price:Float
    )
}