package com.practicum.terminal.data

class ApiServiceMock : ApiService {

    override suspend fun loadBars(timeFrame: String): Result {
        return generateMockBars()
    }
}