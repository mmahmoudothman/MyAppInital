package com.ozman.composetutorial1.data.repository

import com.ozman.composetutorial1.data.datasource.remote.ApiService
import com.ozman.composetutorial1.data.datasource.remote.request.LoginRequest
import com.ozman.composetutorial1.data.datasource.remote.response.LoginResponse
import com.ozman.composetutorial1.domain.repositoryinterface.LoginRepositoryInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class LoginRepositoryImp @Inject constructor(val apiService: ApiService) :
    LoginRepositoryInterface {
    override fun login(username: String, password: String): Flow<LoginResponse> = flow {
//        val response = apiService.login(LoginRequest(username, password))
//        emit(response)
        if (username == "test" && password == "test")
            emit(LoginResponse(true, "success"))
        else
            emit(LoginResponse(false, "error"))

    }.flowOn(Dispatchers.IO)
}