package oop_BasiliusJethro_57833.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol $name ditekan!")
    }
}