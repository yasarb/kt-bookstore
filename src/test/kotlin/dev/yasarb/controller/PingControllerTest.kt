package dev.yasarb.controller

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@MicronautTest
class PingControllerTest {
    @Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @Test
    fun testPing() {
        val request: HttpRequest<Any> = HttpRequest.GET("/ping")
        val body = client.toBlocking().retrieve(request)

        assertNotNull(body)
        assertEquals("PONG", body)
    }
}