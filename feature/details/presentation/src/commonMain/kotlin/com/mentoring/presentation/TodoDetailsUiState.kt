package com.mentoring.presentation

import com.mentoring.domain.model.Todo

data class TodoDetailsUiState(
    val isLoading: Boolean = false,
    val todo: Todo? = null
)
