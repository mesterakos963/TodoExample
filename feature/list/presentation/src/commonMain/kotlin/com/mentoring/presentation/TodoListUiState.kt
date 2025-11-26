package com.mentoring.presentation

import com.mentoring.domain.model.Todo

data class TodoListUiState(
    val isLoading: Boolean = false,
    val todoList: List<Todo> = emptyList()
)