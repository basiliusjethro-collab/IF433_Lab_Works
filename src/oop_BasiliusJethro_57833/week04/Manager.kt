package oop_BasiliusJethro_57833.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Bonus standar (super) + Rp 500.000
        return super.calculateBonus() + 500000
    }
}