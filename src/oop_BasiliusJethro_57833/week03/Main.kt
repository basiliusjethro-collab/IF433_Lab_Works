package oop_BasiliusJethro_57833.week03

import oop_57833_BasiliusJethro.week03.Player
import oop_57833_BasiliusJethro.week03.Weapon

fun main() {
    val e = Employee("Budi", 3000)

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}

val player = Player("Basilius")

// player.xp ❌ (harus error)

player.addXp(50)
player.addXp(60)

val sword = Weapon("Excalibur", 300)

sword.damage = -50
sword.damage = 9999

println("Damage: ${sword.damage}")
println("Tier: ${sword.tier}")