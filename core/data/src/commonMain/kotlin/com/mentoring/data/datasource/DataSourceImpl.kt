package com.mentoring.data.datasource

import com.mentoring.domain.model.Todo
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.flow

class DataSourceImpl(
    private val client: HttpClient
) : DataSource {

    private val baseUrl = "https://jsonplaceholder.typicode.com"

    override suspend fun getTodos() = flow {
        emit(client.get("$baseUrl/todos").body<List<Todo>>())
    }

    override suspend fun getTodoById(id: Int) = flow {
        emit(client.get("$baseUrl/todos/$id").body<Todo>())
    }
}