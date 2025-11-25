package com.mentoring.data.repository

import com.mentoring.data.datastore.DataStore
import com.mentoring.domain.model.Todo
import com.mentoring.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dataStore: DataStore
) : TodoRepository {
    override fun getTodos(): Flow<List<Todo>> {
        TODO("Not yet implemented")
    }

    override fun getTodoById(id: Int): Flow<Todo> {
        TODO("Not yet implemented")
    }
}