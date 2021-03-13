package kr.co.marubook.data.remote.repository

import kr.co.marubook.data.remote.datasource.SearchDataSource

class SearchRepositoryImpl(
    private val searchDataSource: SearchDataSource
) : SearchRepository