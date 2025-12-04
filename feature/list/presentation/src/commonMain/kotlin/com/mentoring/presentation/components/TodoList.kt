package com.mentoring.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mentoring.domain.model.Todo

@Composable
fun TodoList(
    list: List<Todo>,
    onItemClick: (Todo) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(list) { item ->
            TodoListItem(item, onClick = onItemClick)
        }
    }
}