package com.mentoring.domain.usecase

import com.mentoring.domain.repository.TodoRepository

class GetTodoDetailsUseCase(
    private val todoRepository: TodoRepository
) {
    suspend operator fun invoke(id: Int) = todoRepository.getTodoById(id)
}