package oop_BasiliusJethro_57833.week04

// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    // Override method honk dari parent
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}