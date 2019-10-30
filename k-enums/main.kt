/**
 * Enums and Sealed Classes and data classes
 */

package enums

import java.util.*

enum class EntityType {
    EASY, MEDIUM, HARD, HELP;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f) 
            EntityType.HELP -> Entity.Help
        }
    }
}

// data classes generates equals, hashcode and toString automatically for you
sealed class Entity () {
    object Help: Entity() {
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun main(args: Array<String>) {
    val entity1 = EntityFactory.create(EntityType.EASY)
    val entity2 = EntityFactory.create(EntityType.EASY)

    if (entity1 == entity2) {
        println("They are equal")
    } else {
        println("They are not equal")
    }

    val entity3 = Entity.Easy("id", "name");
    val entity4 = Entity.Easy("id", "name");
    val entity5 = entity4.copy()       // copy with a single property change

    if (entity5 == entity4) {
        println("They are equal")
    } else {
        println("They are not equal")
    }

    if (entity5 === entity4) {      // referenceal check means the refernce to the same two classes
        println("They are equal")
    } else {
        println("They are not equal")
    }

    if (entity4 === entity4) {      // referenceal check means the refernce to the same two classes
        println("They are equal")
    } else {
        println("They are not equal")
    }
}
