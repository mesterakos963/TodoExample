package com.mentoring.di.modules

import com.mentoring.data.network.createClient
import io.ktor.client.HttpClient
import org.koin.dsl.module

val networkModule = module {
    single<HttpClient> {
        createClient()
    }
}