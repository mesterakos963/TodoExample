package com.mentoring.todoexample

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.mentoring.presentation.navigation.Navigation
import com.mentoring.presentation.navigation.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val backStack = remember { mutableStateListOf<Screen>(Screen.List) }
        Navigation(
            modifier = Modifier.fillMaxSize(),
            backStack = backStack
        )
    }
}