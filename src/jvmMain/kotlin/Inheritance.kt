fun main() {
    println("Kotlin console below\n")
    Derived("Mars").run {
        questionName()
        sayHello()
        sayBye()
    }
}

open class Base(val name: String) {
    open fun sayHello() {
        println("Hello $name!")
    }
}

fun Base.questionName() {
    println("You're $name, right?")
}

class Derived(private val derivedName: String) : Base("definitely not $derivedName") {
    fun sayBye() {
        println("Bye-bye $name!")
    }

    override fun sayHello() {
        println("What's up $derivedName!")
    }
}

