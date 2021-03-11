package kr.co.marubook.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.marubook.data.remote.datasource.HomeDataSource
import kr.co.marubook.data.remote.datasource.HomeDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun provideHomeDataSource(): HomeDataSource = HomeDataSourceImpl()
}