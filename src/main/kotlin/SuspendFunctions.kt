package org.example

import kotlin.concurrent.thread

data class ProductDescription(val productId: String, val description: String)

fun fetchProductDescription(productId: String): ProductDescription {
    Thread.sleep(1000)
    return ProductDescription(productId, "Description")
}

/*
fun fetchProductDescriptionFromNetwork(
    productId: String,
    onUserReady: (ProductDescription) -> Unit) {
    thread {
        Thread.sleep(1000)
        val user = ProductDescription(productId, "Description")
        onUserReady(user)
    }
    println("end")
}*/
