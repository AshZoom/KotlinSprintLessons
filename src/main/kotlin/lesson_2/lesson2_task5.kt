package org.example.lesson_2

import kotlin.math.pow

fun main() {

//программа калькулятор для банковского приложения
    // начальная сумма вклада
    val startDepositValue = 70000.0
    // годовая процентная ставка в десятичном формате
    val rate = 16.7 / 100
    // количество лет
    val years = 20

    // Формула сложного процентов: A = P * (1 + r)^n
    val finalDepositValue = startDepositValue * (1 + rate).pow(years)

    // Вывод с 3 знаками после запятой
    println(String.format("%.3f", finalDepositValue))

}