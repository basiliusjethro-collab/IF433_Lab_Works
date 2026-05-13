package oop_BasiliusJethro_57833.week12

fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: Tidak bisa dibagi dengan nol!")
        0
    } finally {
        println("Operasi selesai.")
    }
}