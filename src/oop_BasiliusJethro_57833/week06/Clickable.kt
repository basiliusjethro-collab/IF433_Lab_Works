package oop_BasiliusJethro_57833.week06

interface Clickable {
    // Abstract property (tanpa backing field)
    val name: String

    // Function without body (Implicitly Abstract)
    fun click()

    // Function with body (Default method)
    fun showOff() {
        println("Saya bisa diklik!")
    }
}