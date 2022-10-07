import java.time.LocalDateTime

object Singleton{
    val a = 1234

    fun printA() = println(a)
}

fun main() {
    println(Singleton.a)
    Singleton.printA()

    println(DateTimeUtils.now)
    println(DateTimeUtils.now)
    println(DateTimeUtils.now)
    println(DateTimeUtils.now)

    println(DateTimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DateTimeUtils.same(now, now))

    println(MyClass.a)
    println(MyClass.newInstance())
    println(MyClass.Companion.a)
    println(MyClass.Companion.newInstance())
}

object DateTimeUtils{
    val now : LocalDateTime
        get() = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime) : Boolean {
        return a == b
    }
}

class MyClass {

    private constructor()

    companion object{
        val a = 1234

        fun newInstance() = MyClass()
    }
}