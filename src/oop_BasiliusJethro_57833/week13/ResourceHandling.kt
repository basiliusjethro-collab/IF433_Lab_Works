package oop_BasiliusJethro_57833.week13

import java.io.File

fun main() {

    val writer = File("manual.txt").printWriter()

    writer.println("Manual close example")

    writer.close()
}