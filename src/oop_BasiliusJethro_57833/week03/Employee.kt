package oop_BasiliusJethro_57833.week03

class Employee(
    val name: String,
    salary: Int
) {

    var salary: Int = salary
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Salary cannot be negative!")
            }
        }
}