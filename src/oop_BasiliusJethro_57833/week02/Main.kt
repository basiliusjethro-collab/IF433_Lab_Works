package oop_BasiliusJethro_57833.week02

import java.util.Scanner

fun main() {
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