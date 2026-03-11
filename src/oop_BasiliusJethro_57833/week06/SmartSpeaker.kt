package oop_BasiliusJethro_57833.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name ($id) menyala. Siap menerima perintah.")
    }

    override fun turnOff() {
        println("Speaker $name ($id) mati.")
    }

    // Fungsi spesifik
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}