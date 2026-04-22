package oop_BasiliusJethro_57833.week09

fun main() {
    val greet = { name: String -> "Hello $name" }
    println(greet("John"))

    val square: (Int) -> Int = { it * it }
    println(square(5))
}