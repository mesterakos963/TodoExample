package com.mentoring.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mentoring.domain.model.Todo
import com.mentoring.domain.usecase.GetTodoDetailsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class TodoDetailsViewModel(
    private val getTodoDetailsUseCase: GetTodoDetailsUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(TodoDetailsUiState())
    val uiState = _uiState.asStateFlow()

    fun getTodoDetailsById(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            updateLoadingState(true)
            getTodoDetailsUseCase(id).collect { todo ->
                updateTodoDetails(todo)
                updateLoadingState(false)
            }
        }
    }

    private fun updateTodoDetails(todo: Todo) {
        _uiState.update { state ->
            state.copy(todo = todo)
        }
    }

    private fun updateLoadingState(isLoading: Boolean) {
        _uiState.update { state ->
            state.copy(isLoading = isLoading)
        }
    }

}