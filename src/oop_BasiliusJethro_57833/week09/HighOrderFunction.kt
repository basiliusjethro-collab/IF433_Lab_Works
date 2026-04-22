package oop_BasiliusJethro_57833.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)
}