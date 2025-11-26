package com.mentoring.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mentoring.domain.model.Todo
import com.mentoring.domain.usecase.GetTodoListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class TodoListViewModel(
    private val getTodoListUseCase: GetTodoListUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(TodoListUiState())
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            updateLoadingState(true)
            getTodoListUseCase().collect { todoList ->
                updateList(todoList)
                updateLoadingState(false)
            }
        }
    }

    private fun updateList(list: List<Todo>) {
        _uiState.update { state ->
            state.copy(todoList = list)
        }
    }

    private fun updateLoadingState(isLoading: Boolean) {
        _uiState.update { state ->
            state.copy(isLoading = isLoading)
        }
    }

}