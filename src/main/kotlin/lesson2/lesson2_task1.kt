package org.example.lesson2

fun main() {
    // расчет среднеарифметического для 4-х значений
    val values = listOf(3, 4, 3, 5)
    val averageValue = values.average()
    println("%.2f".format(averageValue))
}