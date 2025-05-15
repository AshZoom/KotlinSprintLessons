package org.example.lesson_1

fun main() {
    //Задача 3
    val year = 1961
    var hour = 9
    var minute = 7
    println(year)
    println("Взлёт:")
    println("Часы" + " %02d".format(hour))
    println("Минуты" + " %02d".format(minute))
    hour = 10
    minute = 55
    println("Посадка:")
    println("%02d:%02d".format(hour, minute))
}