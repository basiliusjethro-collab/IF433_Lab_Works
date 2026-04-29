package oop_BasiliusJethro_57833.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println(response.status)
    response.data.forEach {
        println("${it.name} - ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX1", 100.0))
    txRepo.add(Transaction("TX2", 250.0))
}
