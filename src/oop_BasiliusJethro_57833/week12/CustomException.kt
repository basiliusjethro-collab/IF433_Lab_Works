package oop_BasiliusJethro_57833.week12

class InsufficientFundsException(message: String) : Exception(message)

class BankAccount(var balance: Int) {

    fun withdraw(amount: Int) {
        if (amount > balance) {
            throw InsufficientFundsException("Saldo tidak cukup!")
        }

        balance -= amount
        println("Berhasil tarik uang. Sisa saldo: $balance")
    }
}

fun main() {
    val account = BankAccount(100)

    try {
        account.withdraw(200)

        val result = 10 / 0
        println(result)

    } catch (e: InsufficientFundsException) {
        println("Custom Error: ${e.message}")

    } catch (e: ArithmeticException) {
        println("Math Error: ${e.message}")

    } catch (e: Exception) {
        println("General Error: ${e.message}")
    }
}