package oop_BasiliusJethro_57833.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name ($id) aktif.")
        startRecord() // Otomatis memanggil startRecord
    }

    override fun turnOff() {
        println("CCTV $name ($id) dimatikan.")
    }

    override fun startRecord() {
        println("CCTV $name ($id) mulai merekam...")
    }
}