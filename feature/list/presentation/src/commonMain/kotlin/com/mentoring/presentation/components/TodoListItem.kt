package com.mentoring.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.mentoring.domain.model.Todo

@Composable
fun TodoListItem(
    item: Todo,
    onClick: (Todo) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clickable(onClick = { onClick(item) })
            .padding(horizontal = 10.dp)
    ) {
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = item.title,
            color = if (item.completed) Color.Gray else Color.Black,
            style = TextStyle(
                textDecoration = if (item.completed) TextDecoration.LineThrough else null
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        HorizontalDivider(thickness = 1.dp, color = Color.Gray)
    }
}