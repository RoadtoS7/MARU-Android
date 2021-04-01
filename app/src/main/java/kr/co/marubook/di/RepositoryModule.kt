package kr.co.marubook.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.marubook.data.remote.datasource.HomeDataSource
import kr.co.marubook.data.remote.datasource.SearchDataSource
import kr.co.marubook.data.remote.repository.HomeRepository
import kr.co.marubook.data.remote.repository.HomeRepositoryImpl
import kr.co.marubook.data.remote.repository.SearchRepository
import kr.co.marubook.data.remote.repository.SearchRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideHomeRepository(homeDataSource: HomeDataSource): HomeRepository =
        HomeRepositoryImpl(homeDataSource)

    @Provides
    @Singleton
    fun provideSearchRepository(searchDataSource: SearchDataSource): SearchRepository =
        SearchRepositoryImpl(searchDataSource)
}