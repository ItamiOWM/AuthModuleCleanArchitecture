package com.example.authmodulecleanarchitecture.presentation.state

data class LoginState(
    val emailInput: String = "",
    val passwordInput: String = "",
    val isPasswordShown: Boolean = false,
    val isInputValid: Boolean = false,
    val errorMessage: String? = null,
    val isLoading: Boolean = false,
    val isSuccessfullyLoggedIn: Boolean = false,
    val errorMessageLoginProcess: String? = null
)
