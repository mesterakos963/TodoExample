package com.mentoring.domain.usecase

import com.mentoring.domain.model.Todo
import com.mentoring.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow

class GetTodoDetailsUseCase(
    private val todoRepository: TodoRepository
) {
    suspend operator fun invoke(id: Int): Flow<Todo> = todoRepository.getTodoById(id)
}