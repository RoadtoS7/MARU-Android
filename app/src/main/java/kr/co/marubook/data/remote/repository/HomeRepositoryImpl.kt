package kr.co.marubook.data.remote.repository

import kr.co.marubook.data.remote.datasource.HomeDataSource

class HomeRepositoryImpl(
    private val homeDataSource: HomeDataSource
) : HomeRepository