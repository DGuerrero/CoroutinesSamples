package org.example

import kotlinx.coroutines.*

// Simulate a function that fetches data from a network or database
suspend fun fetchData(id: Int): String {
    delay(2000) // Simulating a network delay
    return "Data from source $id"
}

// Simulate a function that processes the fetched data
suspend fun processData(data: String): String {
    delay(1000) // Simulating some processing delay
    return "Processed: $data"
}

fun main() = runBlocking {
    // Launching two async tasks to fetch data concurrently
    val data1 = async { fetchData(1) }
    val data2 = async { fetchData(2) }

    // Awaiting the results of both async tasks
    val result1 = processData(data1.await())
    val result2 = processData(data2.await())

    // Printing the results
    println(result1)
    println(result2)
}
