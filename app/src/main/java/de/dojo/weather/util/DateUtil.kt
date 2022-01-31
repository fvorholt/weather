package de.dojo.weather.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun LocalDateTime.isCurrentHour(): Boolean {
    val currentDate = LocalDateTime.now()

    return currentDate.year == year && currentDate.dayOfYear == dayOfYear && currentDate.hour == hour
}

fun LocalDateTime.isLaterCurrentDay(): Boolean {
    val currentDate = LocalDateTime.now()

    return currentDate.year == year && currentDate.dayOfYear == dayOfYear && hour >= currentDate.hour
}

fun LocalDateTime.readableTimestamp(): String {
    val dateFormatter = DateTimeFormatter.ofPattern("EE, dd MMM HH:MM")
    return format(dateFormatter)
}

fun LocalDateTime.readableHour(): String {
    val dateFormatter = DateTimeFormatter.ofPattern("HH:00")
    return format(dateFormatter)
}