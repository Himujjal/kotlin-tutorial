interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String) {
    companion object Factory: IdProvider {
        override fun getId(): String {
            return id
        }
        const val id = "id";
        fun create() = Entity(id)
    }
}

fun main() {
    val entity = Entity.Factory.create()
    println(Entity.getId())
}