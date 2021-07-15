package com.svetikov.examplekotlinr2dbcp.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("person")
data class Person(
    @Id
    val id: UUID,
    val name: String,
    val address: Address


) {
    data class Address(
        var street: String,
        var zip_code: String,
        var city: String
    )
}



