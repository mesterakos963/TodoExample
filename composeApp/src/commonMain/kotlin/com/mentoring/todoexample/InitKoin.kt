package com.mentoring.todoexample

import com.mentoring.di.modules.appModules
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun startKoinApp(config: KoinAppDeclaration? = null) = startKoin {
    config?.invoke(this)
    modules(appModules)
}