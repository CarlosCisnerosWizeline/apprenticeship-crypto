package com.example.apprenticeshipcrypto.network

class OrderBook {
    var ask: List<Ask>? = null
    var bids: List<Bids>? = null
    var updatedAt: String? = null
    var sequence: Long? = 0
}