package me.priyaaank.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import me.priyaaank.routes.learnerRouting

fun Application.configureRouting() {
    routing {
        learnerRouting()
    }
}