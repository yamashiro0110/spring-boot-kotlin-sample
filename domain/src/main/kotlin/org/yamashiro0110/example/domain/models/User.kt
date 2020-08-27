package org.yamashiro0110.example.domain.models

import java.util.*

class User(val userId: String,
           val userName: String)

interface UserRepository {
    fun findByUserId(userId: String): User
    fun register(user: User)
    fun update(user: User)
}

object UserFactory {
    private fun userId() = UUID.randomUUID().toString()
    fun create(userName: String) = User(this.userId(), userName)
}
