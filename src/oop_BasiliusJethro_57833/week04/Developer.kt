package oop_BasiliusJethro_57833.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String)
    : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak di-override, menggunakan bawaan dari Parent (10% dari baseSalary)
}