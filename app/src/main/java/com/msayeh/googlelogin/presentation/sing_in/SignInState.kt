package com.msayeh.googlelogin.presentation.sing_in

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
