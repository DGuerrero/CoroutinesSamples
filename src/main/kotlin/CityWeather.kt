package org.example

import kotlinx.coroutines.*

data class City(val name: String)
data class CityID(val id: String)
data class WeatherData(val temperature: Double, val description: String)

suspend fun fetchCityID(city: City): CityID {
    delay(1000) // Simulate network delay
    return CityID("5678")
}

suspend fun loadWeatherData(cityID: CityID): WeatherData {
    delay(1000) // Simulate network delay
    return WeatherData(25.0, "Sunny")
}

fun displayWeather(data: WeatherData) {
    println("Weather Data: $data")
}

suspend fun showWeatherInfo(city: City) {
    val cityID = fetchCityID(city)
    val weatherData = loadWeatherData(cityID)
    displayWeather(weatherData)
}

fun main() = runBlocking {
    val city = City("New York")
    showWeatherInfo(city)
}
