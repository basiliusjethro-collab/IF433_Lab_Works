package oop_BasiliusJethro_57833.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    // Kode dari checkpoint sebelumnya
    println("=== Testing Clickable Interface ===")
    val button = Button("Tombol Rahasia")
    button.click()
    button.showOff()

    println("\n=== Testing Smartwatch ===")
    val myWatch = Smartwatch()
    myWatch.showTime()
    myWatch.connectToBluetooth()
    myWatch.chargeBattery()

    println("\n=== Testing Smartphone ===")
    val myPhone = Smartphone()
    myPhone.turnOn()

    println("\n=== Testing Payment ===")
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // TUGAS MANDIRI
    println("\n=== TUGAS MANDIRI: SMART HOME SYSTEM ===")

    // Instansiasi 1 SmartLamp, 1 SmartSpeaker, 1 SmartCCTV
    val lampuTamu = SmartLamp("LMP001", "Lampu Ruang Tamu")
    val speakerDapur = SmartSpeaker("SPK002", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("CCTV003", "Ezviz Garasi")

    println("Perangkat berhasil diinstansiasi:")
    println("- ${lampuTamu.name} (${lampuTamu.id})")
    println("- ${speakerDapur.name} (${speakerDapur.id})")
    println("- ${cctvGarasi.name} (${cctvGarasi.id})")

    // Instansiasi SmartHomeHub
    val hub = SmartHomeHub()
}