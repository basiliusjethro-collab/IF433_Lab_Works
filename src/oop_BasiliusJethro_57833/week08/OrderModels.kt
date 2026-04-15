package oop_BasiliusJethro_57833.week08

data class Order(
    val customer: Customer?
)

data class Customer(
    val address: Address?
)

data class Address(
    val city: String?
)