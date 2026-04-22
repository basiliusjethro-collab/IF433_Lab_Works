package oop_BasiliusJethro_57833.week09

data class Student(val name: String, val score: Int)

fun main() {
    val students = listOf(
        Student("A", 80),
        Student("B", 90),
        Student("C", 70)
    )
    val result = students
        .filter { it.score > 75 }
        .sortedBy { it.score }
        .map { it.name }

    println(result)
}