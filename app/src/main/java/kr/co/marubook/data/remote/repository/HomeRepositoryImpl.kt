package kr.co.marubook.data.remote.repository

import kr.co.marubook.data.remote.datasource.HomeDataSource
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val homeDataSource: HomeDataSource
) : HomeRepository