open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(override var age : Int = 0) : Dog(){

    override fun bark() {
        println("왈왈")
    }
}
//
//fun main() {
//    val dog = ChildBulldog()
//    println(dog.age)
//    dog.bark()
//}

class ChildBulldog : Bulldog () {
    override var age : Int = 0
    override fun bark() {
        super.bark()
    }
}


abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int) : Developer() {
    override fun code(language: String) {

        println("I'm $age. I code with $language")

    }

}

fun main() {
    val developer = BackendDeveloper(34)
    developer.code("kotlin")
}