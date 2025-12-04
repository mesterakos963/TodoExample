package com.mentoring.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mentoring.domain.model.Todo
import com.mentoring.presentation.components.LoadingState
import com.mentoring.presentation.components.TodoList
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun TodoListScreen(
    viewModel: TodoListViewModel = koinViewModel(),
    onItemClick: (Todo) -> Unit,
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Box(modifier = Modifier.fillMaxSize()) {
        if (uiState.isLoading) {
            LoadingState(modifier = Modifier.align(Alignment.Center))
        } else {
            TodoListScreenContent(
                modifier = Modifier.fillMaxSize(),
                todoList = uiState.todoList,
                onItemClick = onItemClick
            )
        }
    }
}

@Composable
fun TodoListScreenContent(
    todoList: List<Todo>,
    onItemClick: (Todo) -> Unit,
    modifier: Modifier = Modifier,
) {
    TodoList(
        modifier = modifier.fillMaxSize(),
        list = todoList,
        onItemClick = onItemClick
    )
}