data class Person(val name: String, val age: Int){
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as Person

        if(name != other.name) return false
        if(age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result;
    }
}

fun main() {

    val person1 = Person("tony", 12)
    val person2 = Person("tony", 12)
    println(person1 == person2)

    val set = hashSetOf(person1)

    println(set.contains(person2))

    println(person1.hashCode())

    println(person2.hashCode())

    println(person1.toString())


    val person3 = person1.copy(name = "stranger")
    println(person3)
    println(person3.hashCode())

    //component N 함수  - property 수만큼 존재

    println("이름: ${person3.component1()} 나이: ${person3.component2()}")

}