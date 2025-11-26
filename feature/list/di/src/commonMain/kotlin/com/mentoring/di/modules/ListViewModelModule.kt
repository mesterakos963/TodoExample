package com.mentoring.di.modules

import com.mentoring.presentation.TodoListViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val listViewModelModule = module {
    viewModelOf(::TodoListViewModel)
}