package com.mentoring.di.modules

import com.mentoring.data.datastore.DataStore
import com.mentoring.data.datastore.DataStoreImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataStoreModule = module {
    singleOf(::DataStoreImpl) bind DataStore::class
}