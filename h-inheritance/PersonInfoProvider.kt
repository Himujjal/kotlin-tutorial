package inheritance

import inheritance.Person

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

// you can now inherit from this class
open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    protected open val sessionIdPrefix = "Session"

    override val providerInfo: String
        get() = "BasicInfoProvider"
    
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional print statement")
    }

    override fun getSessionId(): String = sessionIdPrefix
}

