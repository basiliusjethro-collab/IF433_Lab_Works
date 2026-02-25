package oop_BasiliusJethro_57833.week04


fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()       // Memanggil method milik sendiri
    myCar.honk()            // Memanggil method yang sudah di-override
    myCar.accelerate()      // Memanggil gabungan method Parent dan Child

    println("\n--- Testing ElectricCar (Task 1) ---")
    val tesla = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    tesla.openTrunk()
    tesla.honk()           // Akan memanggil method honk() dari Car
    tesla.accelerate()     // Akan memanggil method accelerate() versi ElectricCar (final)
}