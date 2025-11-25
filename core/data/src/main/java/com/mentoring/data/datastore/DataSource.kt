package com.mentoring.data.datastore

import com.mentoring.domain.model.Todo

interface DataSource {
    fun getTodos(): List<Todo>
}