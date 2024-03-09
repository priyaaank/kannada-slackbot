package me.priyaaank.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.priyaaank.domain.Learner.Learner
import me.priyaaank.domain.Learner.learnerStore

fun Route.learnerRouting() {
    route("/learner") {
        get {
            if(learnerStore.isNotEmpty()) {
                call.respond(learnerStore)
            } else {
                call.respondText("No Learners!", status = HttpStatusCode.OK)
            }
        }
    }
}