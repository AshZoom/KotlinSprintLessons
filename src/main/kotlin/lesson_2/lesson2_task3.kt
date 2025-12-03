package org.example.lesson_2

fun main() {
// Расчет времени прибытия поезда
    // Время выезда часа и минуты
    val departureHour = 9
    val departureMinute = 39

    // Время в пути в минутах
    val travelTime = 457

    // Общее количество минут после выезда
    val totalMinutes = departureHour * 60 + departureMinute + travelTime

    // Час прибытия
    val arrivalHour = (totalMinutes / 60) % 24

    // Минута прибытия
    val arrivalMinute = totalMinutes % 60

    // Вывод в формате чч:мм
    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}