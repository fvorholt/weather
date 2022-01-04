package de.dojo.weather.data.repository

sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Loading<T>(val data: T? = null) : Result<T>()
    data class Error<T>(val code: Int, val reason: String) : Result<T>()
}
