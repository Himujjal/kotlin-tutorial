fun sayHello(greeting: String, vararg itemsToGreet: String) {
        itemsToGreet.forEach { itemToGreet -> println("$greeting $itemToGreet") }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin"): Unit {
    println("$greeting $name")
}

fun main(args: Array<String>) {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", "Kotlin", "Programming", "Comic Books")
    sayHello("Hi", *interestingThings)      // spread operator in kotlin

    println("\n---------------Named Args-----------------\n")
    greetPerson( name = "Nate")
    greetPerson()
    // sayHello(greeting = "Hello", *interestingThings)  // named args and non-named cannot be mixed


    println("\n--------------------------------\n")
    
}