package oop_BasiliusJethro_57833.week07

class NetworkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://www.column.ac.id/api/" //Shared constant

        fun createCLient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}