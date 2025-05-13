package org.example.lesson_1

fun main() {
    //Задача 5
    val secondsTotal = 6480
    val hoursInSpace = secondsTotal / 3600
    val minutsInSpace = (secondsTotal % 3600) / 60
    val secondsInSpace = (secondsTotal % 3600) % 60
    println("%02d:%02d:%02d".format(hoursInSpace, minutsInSpace, secondsInSpace))
}