package oop_BasiliusJethro_57833.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------")
    }
    println("=== TEST MATH HELPER ===")

    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4, 6)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    println("=== TEST PAYMENT SYSTEM ===")

    val ewallet = EWallet("Andi", 50000.0)
    val creditCard = CreditCard("Rina", 100000.0)

    val methods: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (method in methods) {
        method.processPayment(75000.0)
    }
}

