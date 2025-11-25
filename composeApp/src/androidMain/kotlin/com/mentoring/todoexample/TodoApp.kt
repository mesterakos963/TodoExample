package com.mentoring.todoexample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class TodoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoinApp {
            androidLogger()
            androidContext(this@TodoApp)
        }
    }
}