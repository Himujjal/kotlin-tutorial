package interfaces

// interface PersonInfoProvider equivalent to PersonInfoProvider {}

interface PersonInfoProvider {
    val providerInfo: String        // no property initializer

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"
    
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional print statement")
    }

    override fun getSessionId(): String = "SessionID"
}

