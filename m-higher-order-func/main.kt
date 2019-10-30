package HOF

// making the predicate nullable
fun printFilterStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        // if not null
        if(predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith("J") }
}

fun main(args: Array<String>) {
    val list = listOf("kotlin", "java", "c++", "javascript")

    //  if the last parameter of a function is a function, we can use the lambda expression
    //      for declaring the predicate higher order function
    printFilterStrings(list, predicate)
    printFilterStrings(list, getPrintPredicate())
    printFilterStrings(list, null)

}