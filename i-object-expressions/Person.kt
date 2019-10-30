package objectExpression

class Person(private val firstName: String = "Peter",private  val lastName: String = "Parker") {     
    private var nickName: String? = null

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
    
    override fun toString(): String = "${this.firstName} ${this.lastName} (${this.nickName})"

}