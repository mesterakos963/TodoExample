package com.mentoring.di.modules

import com.mentoring.domain.usecase.GetTodoListUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val listUseCaseModule = module {
    singleOf(::GetTodoListUseCase)
}