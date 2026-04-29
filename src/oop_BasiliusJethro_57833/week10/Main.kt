package oop_BasiliusJethro_57833.week10

fun main() {
    val intBox = Box(10)
    val stringBox = Box("Hello")

    println(intBox.getItem())
    println(stringBox.getItem())

    val pair = PairBox("Age", 20)
    println("${pair.key} = ${pair.value}")

    printData(3.14)
    printData("Generic Test")

    val result = getData("Hello")
    println(result)

    val max = findMax(10, 20)
    println("Max: $max")
}