package com.ozman.composetutorial1.presentation.login

import android.util.Log
import androidx.lifecycle.ViewModel
import com.ozman.composetutorial1.domain.repositoryinterface.LoginRepositoryInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.lifecycle.viewModelScope
import com.ozman.composetutorial1.data.datasource.remote.response.LoginResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val repository: LoginRepositoryInterface
) : ViewModel() {

    private val _loginState = MutableStateFlow<LoginResponse?>(null)
    val loginState: StateFlow<LoginResponse?> = _loginState.asStateFlow()

    fun login(username: String, password: String) {
        viewModelScope.launch {
            repository.login(username, password)
                .catch { e ->
                    Log.e("LoginError", "Login failed: ${e.message}")
                    _loginState.value = LoginResponse(success = false, message = "Login failed: ${e.message}")
                }
                .collect { response ->
                    _loginState.value = response
                }
        }
    }
}