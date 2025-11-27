package com.mentoring.domain.usecase

import com.mentoring.domain.repository.TodoRepository

class GetTodoListUseCase(
    private val todoRepository: TodoRepository
) {
    suspend operator fun invoke() = todoRepository.getTodos()
}