package oop_BasiliusJethro_57833.week04

// ElectricCar adalah Child dari Car
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int)
    : Car(brand, numberOfDoors) {

    // Final override agar tidak bisa diubah oleh turunan berikutnya
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }

    // Method honk() akan mewarisi dari Car (TIN TIN...)
    // Method openTrunk() akan mewarisi dari Car
}