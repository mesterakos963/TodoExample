package com.mentoring.di.modules

import com.mentoring.data.datasource.DataSource
import com.mentoring.data.datasource.DataSourceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val dataSourceModule = module {
    singleOf(::DataSourceImpl) bind DataSource::class
}