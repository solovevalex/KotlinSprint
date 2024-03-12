package org.example.lesson_1

fun main() {
    var numberOfOrders: Int = 72
    val gratitudeWords: String = "Спасибо, что сделали заказ"

    println(numberOfOrders)
    println(gratitudeWords)

    var numberOfWorkers: Int
    numberOfWorkers = 2000
//    print("В компании работает: $numberOfWorkers человек")
    numberOfWorkers = numberOfWorkers - 1
    print("В компании работает: $numberOfWorkers человек")
}