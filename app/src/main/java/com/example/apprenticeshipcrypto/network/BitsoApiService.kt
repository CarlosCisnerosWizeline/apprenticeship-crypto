package com.example.apprenticeshipcrypto.network

import retrofit2.Retrofit
import retrofit2.http.GET

private const val BASE_URL = "https://api.bitso.com/v3/"

private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .build()
interface BitsoApiService {
    @GET("available_books")
    suspend fun getAvailableBooks(): List<Book>

    @GET("ticker")
    suspend fun getTicker(): List<Ticker>

    @GET("order_book")
    suspend fun getOrderBook(): List<OrderBook>
}