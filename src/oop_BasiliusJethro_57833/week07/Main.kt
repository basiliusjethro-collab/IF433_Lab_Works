package oop_BasiliusJethro_57833.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createCLient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = RegularUser("Alice", 22)
    val data2 = RegularUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val Message = when(response) {
        is ApiResponse.Success -> "Succes"
        is ApiResponse.Error -> "Error"
        ApiResponse.Loading -> "Loading..."
    }

    GameManager.startGame()
    GameManager.startGame()

    println(ItemRarity.LEGENDARY.dropChance)

    val weapon = Weapon.forgeStarterSword()
    println(weapon.item)

    val upgradedItem = weapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}