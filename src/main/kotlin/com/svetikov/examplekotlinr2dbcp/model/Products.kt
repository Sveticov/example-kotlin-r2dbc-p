package com.svetikov.examplekotlinr2dbcp.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("products")
data class Products(
    @Id
    val id: UUID?,
    val name: String,
    val model:String,
    val price:Float
) {


}