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
    println("Checkpoint 9 executed")

    val nullString: String? = null

    try {
        val safeValue = requireNotNull(nullString) { "Value cannot be null!" }
        println(safeValue)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    val result = LegacyJavaAPI.getData()!!
    println("Java result: $result")

    runMockUnitTest()
}