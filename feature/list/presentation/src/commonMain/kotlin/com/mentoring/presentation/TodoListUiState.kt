package com.mentoring.presentation

import androidx.compose.runtime.Stable
import com.mentoring.domain.model.Todo

@Stable
data class TodoListUiState(
    val isLoading: Boolean = false,
    val todoList: List<Todo> = emptyList()
)