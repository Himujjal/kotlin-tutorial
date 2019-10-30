fun main() {
    val list = listOf("Kotlin", "Java", "C", "JavaScript", null, null)
    var map = list
    .filterNotNull()
    .take(3)            // take first 3 elements
    // .filter {
    //     it.startsWith("J")
    // }
    // .map {
    //     it.length
    // }
    .associate { it to it.length }      // making a list as a map
    .forEach {
        println("${it.value}: ${it.key}")
    }

    val language = list.filterNotNull().first()
    println(language)
    println(list.last())
    
    val language2 = list.filterNotNull().find { it.startsWith("Java") }.orEmpty()     
    println(language2)
}