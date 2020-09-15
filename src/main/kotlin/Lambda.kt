fun main() {
    val user = User("Kotlin", 1, "1111111")

    listOf(1, 2).forEach {
        println(it)
        user.apply {
            user.apply {
                println(name)
            }
            return@apply
        }
        println(it)
    }

    val user1 = User("java",2,"123123").apply {
        this.age = 3
    }

    println(user1.age)
}