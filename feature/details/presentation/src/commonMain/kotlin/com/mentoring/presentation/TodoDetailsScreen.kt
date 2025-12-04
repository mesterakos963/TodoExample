package com.mentoring.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mentoring.domain.model.Todo
import com.mentoring.presentation.components.BackButton
import com.mentoring.presentation.components.LoadingState
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun TodoDetailsScreen(
    id: Int,
    onBackClick: () -> Unit,
    viewModel: TodoDetailsViewModel = koinViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(id) {
        viewModel.getTodoDetailsById(id = id)
    }

    Box(modifier = Modifier.fillMaxSize()) {
        if (uiState.isLoading) {
            LoadingState(modifier = Modifier.align(Alignment.Center))
        } else {
            TodoDetailsScreenContent(
                modifier = Modifier.fillMaxSize(),
                todo = uiState.todo,
                onBackClick = onBackClick
            )
        }
    }
}

@Composable
fun TodoDetailsScreenContent(
    todo: Todo?,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Spacer(modifier = Modifier.height(30.dp))
        BackButton(onClick = onBackClick)
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(text = "${todo?.id}")
            Text(text = "${todo?.userId}")
            Text(text = "${todo?.title}")
        }
    }
}