val name: String = "A"          // immutable variable - like a const at runtime

fun main(args: Array<String>) {
    println("-------------------------------------------")


    // var nameVar: String = "Var"
    // nameVar = "VariableB"
    // println(name)
    // println(nameVar)

    // --------- nullable vars -------------
    println("\n--------------------------------\n")

    // greeting is nullable. Types are non-null by default in kotlin
    var greeting: String? = null 
    greeting = "Hello"
    greeting = null
    println(greeting?.length)

    // if (greeting != null) {
    //     println(greeting)
    // } else {
    //     println("Hi")
    // }

    // when(greeting) {
    //     null -> println("Hi")
    //     else -> println(greeting)
    // }

    
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)

    val greetingToPrint2 = when(greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint2)

    println("\n--------------------------------\n")

    


}