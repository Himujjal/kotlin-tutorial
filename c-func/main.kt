fun getGreeting() = "Hello"

fun sayHello(itemToGreet: String, greeting: String = "Hello") {
    val msg = "$greeting $itemToGreet"
    println(msg)
}

fun main() {
    println("Hello World")
    println(getGreeting())
    sayHello("Hey", "Himu")
}
