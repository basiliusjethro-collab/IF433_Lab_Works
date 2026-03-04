package oop_BasiliusJethro_57833.week05


abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}