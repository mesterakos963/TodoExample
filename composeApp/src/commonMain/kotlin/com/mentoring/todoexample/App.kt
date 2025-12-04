package com.mentoring.todoexample

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.mentoring.presentation.TodoDetailsScreen
import com.mentoring.presentation.TodoListScreen
import com.mentoring.presentation.navigation.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val backStack = remember { mutableStateListOf<Screen>(Screen.List) }

        NavDisplay(
            modifier = Modifier.fillMaxSize(),
            backStack = backStack,
            onBack = { backStack.removeLastOrNull() },
            transitionSpec = {
                fadeIn(tween(300)) togetherWith fadeOut(tween(300))
            },
            entryProvider = entryProvider {
                entry<Screen.List> {
                    TodoListScreen(
                        onItemClick = { todo -> backStack.add(Screen.Details(todo.id)) }
                    )
                }

                entry<Screen.Details> { key ->
                    TodoDetailsScreen(
                        id = key.id,
                        onBackClick = { backStack.removeLastOrNull() })
                }
            }
        )
    }
}