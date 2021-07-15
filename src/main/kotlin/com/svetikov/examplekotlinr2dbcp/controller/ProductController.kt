package com.svetikov.examplekotlinr2dbcp.controller

import com.svetikov.examplekotlinr2dbcp.model.Person
import com.svetikov.examplekotlinr2dbcp.model.Products
import com.svetikov.examplekotlinr2dbcp.model.RequestProduct
import com.svetikov.examplekotlinr2dbcp.repository.PersonRepository
import com.svetikov.examplekotlinr2dbcp.repository.ProductRepository
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@RestController
@RequestMapping("/api/product")
class ProductController(
    private val repository: ProductRepository,
    private val repoPerson:PersonRepository
) {

    @GetMapping("/all")
    fun findAllProducts() =
        repository.findAll()

    @PostMapping()
    fun createProduct(@RequestBody product: RequestProduct.CreateProduct): Mono<Products> {
        val productNew = Products(null, product.name, product.model, product.price)
        return repository.save(productNew)
    }

    @DeleteMapping("/{model}")
    fun deleteProduct(@PathVariable model: String): Mono<Products> {
        return repository.deleteByModel(model)
    }

    @GetMapping("/{model}")
    fun getModel(@PathVariable model: String): Mono<Products> {
        return repository.findByModel(model)
    }

    @GetMapping("/person")
    fun testPerson() =
       repoPerson.findAllSummary()


}