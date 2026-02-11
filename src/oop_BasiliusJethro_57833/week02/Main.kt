package oop_BasiliusJethro_57833.week02

import java.util.Scanner

fun main() {
    runStudentSystem()
    //runLoanSystem()
}
fun runStudentSystem() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    println("Pilih Jalur:")
    println("1. Dengan Jurusan")
    println("2. Tanpa Jurusan")

    val choice = scanner.nextInt()
    scanner.nextLine()

    val student = if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        Student(name, nim, major)
    } else {
        Student(name, nim)
    }
}

fun runLoanSystem() {
    val scanner = Scanner(System.`in`)

    println("=== LIBRARY SYSTEM ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) duration = 1

    val loan = Loan(title, borrower, duration)

    println("Total Denda: Rp ${loan.calculateFine()}")
}