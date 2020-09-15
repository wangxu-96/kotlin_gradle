enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Shape(value: Int) {
    ovel(100),
    rectangle(200)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

fun main() {

    val let = "".let {
        println("length: ${it.length}")
        1000
    }
    println("let $let")

    val user = User("Kotlin", 1, "1111111")

    val result = with(user) {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("result: $result")

    val run = user.run {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }

    println("run $run")

    val apply = user.apply {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
    println("apply $apply")

    val also = user.also {
        println(it.age)
    }
    println(also)

    val handle: (User, Int) -> Unit = { user, num ->
        user.apply {
            println("unit $name")
        }
    }

    handle(user, 2)

    listOf(1,2,3).forEach { foo(it)() }

}

fun foo(int: Int): () -> Unit = {
    print(int)
}

class User(var name: String, var age: Int, var phoneNum: String) {
}
