package oop_BasiliusJethro_57833.week10

class NumericalStorage<T : Number>(private val num: T) {
    fun toDouble(): Double {
        return num.toDouble()
    }
}