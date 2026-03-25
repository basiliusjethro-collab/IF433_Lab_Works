package oop_BasiliusJethro_57833.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createCLient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = RegularUser("Alice", 22)
    val data2 = RegularUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")
}