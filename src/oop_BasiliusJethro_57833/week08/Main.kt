package oop_BasiliusJethro_57833.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    val city = order.customer?.address?.city ?: "Unknown City"
    println("City: $city")

    order.customer?.address?.city?.let {
        println("City found: $it")
    }

    val items: List<Any> = listOf("Hello", 123, "World", 45.6)
    for (item in items) {
        val str = item as? String
        if (str != null) {
            println("String: $str")
        }
    }
    for (item in items) {
        val value = item as? String ?: "Not a String"
        println(value)
    }
}