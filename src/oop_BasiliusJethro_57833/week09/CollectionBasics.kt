package oop_BasiliusJethro_57833.week09

fun main() {
    val immutableList = listOf("A", "B", "C")
    val mutableList = mutableListOf("A", "B", "C")

    mutableList.add("D")

    println(immutableList)
    println(mutableList)
}