package com.mentoring.di.modules

import com.mentoring.data.repository.TodoRepositoryImpl
import com.mentoring.domain.repository.TodoRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::TodoRepositoryImpl) bind TodoRepository::class
}