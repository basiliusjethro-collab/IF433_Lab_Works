package oop_BasiliusJethro_57833.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter ->
            println("Musuh muncul: ${event.monsterName}")

        is BattleState.LootDropped ->
            println("Mendapat loot: ${event.item.name} (${event.item.rarity})")

        is BattleState.GameOver ->
            println("Game Over: ${event.reason}")

        BattleState.SafeZone ->
            println("Berada di Safe Zone")
    }
}