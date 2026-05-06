package oop_BasiliusJethro_57833.week11

class User {
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val user = User().apply {
        name = "John"
        age = 25
    }

    println(user.name)

    user.also {
        println("User created: ${it.name}")
    }

    with(user) {
        println(name)
        println(age)
    }
    val user2 = User().apply {
        name = "Alice"
        age = 30
    }.also {
        println("Initialized: ${it.name}")
    }
}