package com.practicum.terminal.data

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("aggs/ticker/AAPL/range/{timeframe}/2025-01-01/2025-02-01?adjusted=true&sort=desc&limit=5000&apiKey=YourApiKeyHere")
    suspend fun loadBars(
        @Path("timeframe") timeFrame: String
    ): Result

}