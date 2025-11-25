package com.mentoring.domain.repository

import com.mentoring.domain.model.Todo
import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    fun getTodos(): Flow<List<Todo>>
    fun getTodoById(id: Int): Flow<Todo>
}