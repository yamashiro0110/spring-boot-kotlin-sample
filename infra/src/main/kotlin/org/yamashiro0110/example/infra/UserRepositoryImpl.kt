package org.yamashiro0110.example.infra

import org.yamashiro0110.example.domain.models.User
import org.yamashiro0110.example.domain.models.UserRepository

class UserRepositoryImpl : UserRepository {
    override fun findByUserId(userId: String): User {
        return User(userId, "sample user")
    }

    override fun register(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
