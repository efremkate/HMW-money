package ru.netology

fun main() {
    val amount = 1000000
    val commission = (amount / 100) * 0.75
    val minCommission = 3500.0
    val result = if (commission < minCommission) minCommission else commission

    println("Комиссия составит " + result)
}