package dev.yasarb

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
        title = "kt-bookstore",
        description = "Simple bookstore API with Kotlin/Micronaut",
        version = "1.0",
        license = License(
            name = "MIT License",
            url = "https://github.com/yasarb/kt-bookstore/blob/master/LICENSE",
        ),
        contact = Contact(url = "https://yasarb.dev", name = "Yasar",)
    )
)
object Api {
}

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("dev.yasarb")
        .start()
}

