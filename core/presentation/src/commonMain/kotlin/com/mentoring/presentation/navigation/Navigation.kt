package com.mentoring.presentation.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.mentoring.presentation.TodoDetailsScreen
import com.mentoring.presentation.TodoListScreen

@Composable
fun Navigation(
    modifier: Modifier = Modifier,
    backStack: SnapshotStateList<Screen>,
) {
    NavDisplay(
        modifier = modifier,
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