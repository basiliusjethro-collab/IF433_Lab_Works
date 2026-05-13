package oop_BasiliusJethro_57833.week12

fun main() {

    val result = runCatching {
        10 / 0
    }

    println(result)

    val safeResult = runCatching {
        10 / 0
    }.getOrElse {
        println("Terjadi error: ${it.message}")
        -1
    }

    println("Safe Result: $safeResult")
}