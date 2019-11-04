import inheritance.*

fun main(args: Array<String>) {
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    println(provider.getSessionId())

}