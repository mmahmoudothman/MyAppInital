package com.ozman.composetutorial1.domain.repositoryinterface

import com.ozman.composetutorial1.data.datasource.remote.response.LoginResponse
import kotlinx.coroutines.flow.Flow

interface LoginRepositoryInterface {

    fun login(username: String, password: String): Flow<LoginResponse>
}