package org.example.lesson_1

fun main() {
    //Задача 5

    val SECONDS_IN_HOUR = 3600
    val MINUTES_IN_HOUR=60
    val SECONDS_IN_MINUTE=60
    val secondsTotal = 6480
    val restOfSeconds = secondsTotal % SECONDS_IN_HOUR
    val hoursInSpace = secondsTotal / SECONDS_IN_HOUR
    val minutsInSpace = restOfSeconds / MINUTES_IN_HOUR
    val secondsInSpace = restOfSeconds % SECONDS_IN_MINUTE
    println("%02d:%02d:%02d".format(hoursInSpace, minutsInSpace, secondsInSpace))
}