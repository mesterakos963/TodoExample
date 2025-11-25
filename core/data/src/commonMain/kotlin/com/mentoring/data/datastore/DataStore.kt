package com.mentoring.data.datastore

import com.mentoring.domain.model.Todo
import kotlinx.coroutines.flow.Flow

interface DataStore {
    suspend fun getTodos(): Flow<List<Todo>>

    suspend fun getTodoById(id: Int): Flow<Todo>
}