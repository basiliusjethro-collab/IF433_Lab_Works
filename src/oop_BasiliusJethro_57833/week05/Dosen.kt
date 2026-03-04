package oop_BasiliusJethro_57833.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan mervisi RPKPS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}