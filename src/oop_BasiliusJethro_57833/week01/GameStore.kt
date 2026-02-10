package oop_BasiliusJethro_57833.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int) =
    if (price > 500000) (price * 80) / 100
    else (price * 90) / 100