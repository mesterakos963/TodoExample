package com.mentoring.data.repository

import com.mentoring.data.datasource.DataSource
import com.mentoring.domain.repository.TodoRepository

class TodoRepositoryImpl(
    private val dataSource: DataSource
) : TodoRepository {
    override suspend fun getTodos() = dataSource.getTodos()

    override suspend fun getTodoById(id: Int) = dataSource.getTodoById(id)
}