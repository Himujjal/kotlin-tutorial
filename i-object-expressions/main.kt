import objectExpression.*

fun main(args: Array<String>) {
    val provider = object: PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"
        
        fun getSessionId() = "id"
    }

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
    
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("Not a session info provider")
    } else {
        println("Is a session info provider")

        // compiler performing a smart cast to SessionInfoProvider according to if-else block
        infoProvider.getSessionId()
    }
}