package com.mentoring.data.datasource

import com.mentoring.domain.model.Todo
import kotlinx.coroutines.flow.Flow

interface DataSource {
    suspend fun getTodos(): Flow<List<Todo>>

    suspend fun getTodoById(id: Int): Flow<Todo>
}