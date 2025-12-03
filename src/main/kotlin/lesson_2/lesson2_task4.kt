package org.example.lesson_2

fun main() {

// Добытое количество кристаллической и железной руды
    val crystal = 7
    val iron = 11

    // Усиление в процентах
    val bustPercent = 20

    // Расчет добытой руды с усилением
    val bonusCrystal = (crystal * bustPercent / 100.0).toInt()
    val bonusIron = (iron * bustPercent / 100.0).toInt()

    // Вывод результата
    println("Бонусная кристаллическая руда: $bonusCrystal")
    println("Бонусная железная руда: $bonusIron")


}