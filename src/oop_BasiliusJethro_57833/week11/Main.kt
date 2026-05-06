package oop_BasiliusJethro_57833.week11

fun main() {
    val text: String? = "Kotlin"

    println(text.hello())
    println(text.safeLength())
}

fun main() {
    val result = "Hello".run {
        this.length * 2
    }

    println(result)
}