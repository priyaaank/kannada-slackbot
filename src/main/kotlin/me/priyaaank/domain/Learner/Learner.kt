package me.priyaaank.domain.Learner

import kotlinx.serialization.Serializable

@Serializable
data class Learner(val id: Long, val username: String)

val learnerStore = mutableListOf<Learner>()

