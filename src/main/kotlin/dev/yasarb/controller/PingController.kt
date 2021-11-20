package dev.yasarb.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse

@Controller("/ping")
class PingController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(
        summary = "Health check",
        description = "A PONG is returned"
    )
    @ApiResponse(
        content = [Content(
            mediaType = MediaType.TEXT_PLAIN,
            schema = Schema(type = "string")
        )]
    )
    fun index(): String {
        return "PONG"
    }
}