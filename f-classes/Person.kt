package org.example

// ------------- visibility modifiers
//  internal - only avaialble to a certain module. e.g. this module is Person.kt
//  private - only available to the class
//  protected - available to child classes and the current class
//  public - public
// ------------------------------------


// direct firstName and lastName properties using val
class Person(val firstName: String = "Peter", val lastName: String = "Parker") {     
    // val firstName: String = _firstName
    // val lastName: String = _lastName

    // init {
        // firstName = `_firstName`
        // lastName = `_lastName`
        // println("Init 1")
    // }

    // ------- Secondary Constructor ------------
    // constructor(): this("Peter", "Parker") {
    //     println("Secondary Constructor")
    // }

    // init {
    //     println("Init 2")
    // }

    // ----------- new property ---------------
    var nickName: String? = null
    //     set(value) {
    //         field = value
    //         println("The new nickname is $value")
    //     }
    //     get() {
    //         println("The returned value is $field")
    //         return field
    //     }

    // ----------- Methods --------------------
    fun printInfo() {
        // -- ?: === when(nickname) { null -> "no nickname" else nickname }
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }

    // ---------- toString() ----------------
    // fun toString(): String = "${this.firstName} ${this.lastName} (${this.nickName})"

}