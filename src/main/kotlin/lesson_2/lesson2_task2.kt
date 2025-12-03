package org.example.lesson_2

fun main() {
    //Задача по расчету зарплаты
        val constantEmployees = 50
        val traineeEmployees = 30

        val constantSalary = 30000
        val traineeSalary = 20000

        //  Зарплата постоянных сотрудников
        val expensesConstant = constantEmployees * constantSalary

        // Общие расходы по зарплате после прихода стажеров
        val totalExpenses = expensesConstant + traineeEmployees * traineeSalary

        // Средняя зарплата на одного сотрудника после устройства стажеров
        val averageSalary = totalExpenses / (constantEmployees + traineeEmployees)

        println("Расходы на выплату зарплаты постоянных сотрудников: $expensesConstant")
        println("Общие расходы по зарплате после прихода стажеров: $totalExpenses")
        println("Средняя зарплата одного сотрудника после устройства стажеров: $averageSalary")


}