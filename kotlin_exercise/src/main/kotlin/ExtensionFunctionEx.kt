fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage(message: String) = println("확장 출력")

fun MyExample?.printNullOrNotNull(){
    if(this == null)println("null입니다")
    else println("null이 아닙니다")
}

fun main() {
    println("ABCD".first())
    println("ABCD".addFirst('Z'))

    MyExample().printMessage()
    MyExample().printMessage("메세지")


    var myExample:MyExample? = null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
}

