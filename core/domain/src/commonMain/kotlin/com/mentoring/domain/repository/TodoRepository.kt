package com.mentoring.domain.repository

import com.mentoring.domain.model.Todo
import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun getTodos(): Flow<List<Todo>>
    suspend fun getTodoById(id: Int): Flow<Todo>
}