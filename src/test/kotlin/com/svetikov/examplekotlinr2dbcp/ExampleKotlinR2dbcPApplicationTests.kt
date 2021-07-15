package com.svetikov.examplekotlinr2dbcp

import com.svetikov.examplekotlinr2dbcp.model.Person
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.*

@SpringBootTest
class ExampleKotlinR2dbcPApplicationTests {

    @Test
    fun contextLoads() {
        testPerson()
    }
    fun testPerson() {
        val person =   Person(UUID.randomUUID(), "test",
            Person.Address("Vas","9700","Kiev"))

        println(person.toString())
        println(person.a.toString())
    }
}
