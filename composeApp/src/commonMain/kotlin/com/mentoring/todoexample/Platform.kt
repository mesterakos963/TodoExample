package com.mentoring.todoexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform