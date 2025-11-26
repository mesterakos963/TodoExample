package com.mentoring.di.modules

import com.mentoring.domain.usecase.GetTodoDetailsUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val detailsUseCaseModule = module {
    singleOf(::GetTodoDetailsUseCase)
}