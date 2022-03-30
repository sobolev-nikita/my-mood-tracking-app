package com.niksob.data.storage.db

import com.niksob.domain.data.dto.login.AuthCallbackDto
import com.niksob.domain.data.dto.login.LoginDataCallbackDto

interface DbAuthStorage {
    fun authorize(loginDataCallbackDto: LoginDataCallbackDto)

    fun register(loginDataCallbackDto: LoginDataCallbackDto)

    fun loadAuthorizeUserId(callback: AuthCallbackDto)
}
