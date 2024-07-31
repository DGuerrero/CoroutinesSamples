package org.example

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    (1..10000).forEach {
        GlobalScope.launch {
            val threadName = Thread.currentThread().name
            println("$it printed on thread $threadName")
        }
    }
    Thread.sleep(1000)
}