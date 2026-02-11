package oop_BasiliusJethro_57833.week02

class Student(
    val name: String,
    val nim: String,
    var major: String
    val gpa: Double = 0.0
) {

    init {
        if (nim.length != 5) {
            println("WARNING: NIM $nim tidak valid!")
        } else {
            println("LOG: Student $name berhasil dibuat.")
        }
    }

    constructor(name: String, nim: String) :
            this(name, nim, "Non-Matriculated")
}