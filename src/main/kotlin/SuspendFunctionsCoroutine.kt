package org.example

import kotlinx.coroutines.delay

suspend fun getUserSuspend(userId: String): ProductDescription {
    delay(1000)
    //val description = getProductDescriptionSuspend(userId)
    val description = ProductDescription(userId, "Description")
    return description
}

/*
suspend fun getProductDescriptionSuspend(productId: String): ProductDescription {
    delay(3000)
    val description = ProductDescription(productId, "Description")
    return description
}*/
