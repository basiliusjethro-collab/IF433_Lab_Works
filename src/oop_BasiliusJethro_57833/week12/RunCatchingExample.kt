package oop_BasiliusJethro_57833.week12

fun main() {

    val result = runCatching {
        10 / 0
    }

    println(result)
}