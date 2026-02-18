package oop_BasiliusJethro_57833.week03

class Employee(
    val name: String,
    salary: Int
) {
    fun increasePerformance() {
        TODO("Not yet implemented")
    }

    var salary: Int = salary
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Salary cannot be negative!")
            }
        }
    val tax: Int
        get() = salary / 10
}

private var performanceRating: Int = 0

fun updateRating(newRating: Int) {
    if (newRating in 1..5) {
        performanceRating = newRating
    } else {
        println("Rating must be between 1 and 5")
    }
}

//For checkpoint 6 (Already Clean
