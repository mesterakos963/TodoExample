package com.mentoring.presentation.navigation

import kotlinx.serialization.Serializable

sealed interface Screen {
    @Serializable
    data object List : Screen

    @Serializable
    data class Details(val id: Int) : Screen
}