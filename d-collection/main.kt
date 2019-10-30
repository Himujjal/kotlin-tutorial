fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach {
        itemToGreet -> println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    for(interestingThing in interestingThings) {
        println(interestingThing)
    }

    // lambda syntax in kotlin. parenthesis is ommitted if only one param is available
    interestingThings.forEach {
        // it is the default name for the iterable item in the array
        // println(it)
    
        interestingThing -> println(interestingThing)
    }

    interestingThings.forEachIndexed { index, interestingThing -> 
        println("$interestingThing is at index $index")
    }

    println("\n-------------list of-------------------\n")

    val interestingThings2 = listOf("Kotlin", "Programming", "Comic Books")
    interestingThings2.forEach { interestingThing2 -> println(interestingThing2) }

    println("\n-------------maps-------------------\n")

    val map = mapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")
    map.forEach {
        key, value -> println("$key -> $value")
    }

    println("\n--------------immutable vs mutable------------------\n")
    // interestingThings.add()  // doesn't work    
    val mutList = mutableListOf("A", "B", "C")
    mutList.add("D")            // mutable list
    println("mutList.length -> ${mutList.size}")

    val map2 = mutableMapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")
    map2.put(4, "d")
    println("mutMap.length -> ${map2.size}")

    sayHello("Hey", interestingThings2)
}