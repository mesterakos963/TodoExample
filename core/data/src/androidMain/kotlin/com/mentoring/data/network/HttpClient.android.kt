package com.mentoring.data.network

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp

actual val httpClient: HttpClientEngine
    get() = OkHttp.create()