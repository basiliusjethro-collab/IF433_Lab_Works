package oop_BasiliusJethro_57833.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (5 digit): ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("NIM tidak valid. Program dihentikan.")
        return
    }

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    val student = Student(name, nim, major)
}