package com.mentoring.presentation

import androidx.compose.runtime.Stable
import com.mentoring.domain.model.Todo

@Stable
data class TodoDetailsUiState(
    val isLoading: Boolean = false,
    val todo: Todo? = null
)
