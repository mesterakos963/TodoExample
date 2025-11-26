package com.mentoring.data.repository

import com.mentoring.data.datastore.DataStore
import com.mentoring.domain.model.Todo
import com.mentoring.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dataStore: DataStore
) : TodoRepository {
    override suspend fun getTodos(): Flow<List<Todo>> = dataStore.getTodos()

    override suspend fun getTodoById(id: Int): Flow<Todo> = dataStore.getTodoById(id)
}