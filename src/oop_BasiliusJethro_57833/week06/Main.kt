package oop_BasiliusJethro_57833.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    // Testing dari checkpoint 3
    println("=== Testing Clickable Interface ===")
    val button = Button("Tombol Rahasia")
    button.click()
    button.showOff()

    // Testing Smartwatch
    println("\n=== Testing Smartwatch ===")
    val myWatch = Smartwatch()
    myWatch.showTime()
    myWatch.connectToBluetooth()
    myWatch.chargeBattery()

    // Testing Smartphone
    println("\n=== Testing Smartphone ===")
    val myPhone = Smartphone()
    myPhone.turnOn()

    // Testing Payment
    println("\n=== Testing Payment ===")
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)
}