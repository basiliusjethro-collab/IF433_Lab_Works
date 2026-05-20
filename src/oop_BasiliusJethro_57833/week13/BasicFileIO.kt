package oop_BasiliusJethro_57833.week13

import java.io.File

fun main() {

    val file = File("notes.txt")

    file.writeText("Hello File I/O!")

    file.appendText("\nThis is appended text.")
}