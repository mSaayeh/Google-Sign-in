package com.msayeh.googlelogin.presentation

/**
 * Contract for information needed on every navigation destination
 *
 * @property route The string route of the destination.
 */
interface Destinations {
    val route: String
}

object SignInDestination : Destinations {
    override val route = "signIn"
}

object ProfileDestination : Destinations {
    override val route = "profile"
}