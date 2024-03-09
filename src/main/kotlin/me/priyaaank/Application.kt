package me.priyaaank

import io.ktor.server.application.*
import me.priyaaank.plugins.configureRouting
import me.priyaaank.plugins.configureSerialization

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
}