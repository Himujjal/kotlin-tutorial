package declarations

object EntityFactory {
    fun create() = Entity("id", "name")
}

class Entity (val id: String, val name: String) {
    override fun toString(): String {
        return "id: $id, name: $name"
    }
}
