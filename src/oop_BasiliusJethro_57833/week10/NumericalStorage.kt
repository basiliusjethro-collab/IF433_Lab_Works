package oop_BasiliusJethro_57833.week10

class NumericalStorage<T : Number>(private val num: T) {
    fun toDouble(): Double {
        return num.toDouble()
    }
}

fun <T> findMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}