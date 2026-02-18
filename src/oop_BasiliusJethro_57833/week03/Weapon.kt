package oop_57833_BasiliusJethro.week03

class Weapon(
    val name: String,
    damage: Int
) {

    var damage: Int = damage
        set(value) {
            when {
                value < 0 -> {
                    println("Damage cannot be negative!")
                }
                value > 1000 -> {
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}