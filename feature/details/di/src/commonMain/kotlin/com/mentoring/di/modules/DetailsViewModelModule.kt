package com.mentoring.di.modules

import com.mentoring.presentation.TodoDetailsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val detailsViewModelModule = module {
    viewModelOf(::TodoDetailsViewModel)
}