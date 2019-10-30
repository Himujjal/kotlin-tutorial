import org.example.Person

fun main(args: Array<String>) {
    var person = Person("Himujjal", "Upadhyaya")

    // println(person.firstName)
    // println(person.lastName)

    println("\n--------------------------------\n")
    
    var person2 = Person()
    println(person2.firstName)
    println(person2.lastName)
    person2.nickName = "Shades"
    // println(person2.nickName)
    // println(person2)
    
    println("\n--------------------------------\n")
    person2.printInfo() 


}