fun main() {

    val list = mutableListOf(printHello)
    //list[0]()

    call(list[0])

//    call(printNo()) // 함수형 프로그래밍이 아니면 인자로 넣을 수 없음


    val list2 = listOf("a", "b", "c")
    val printStr : (String) -> Unit = {println("$it : 인쇄")}
    forEachStr(list2, printStr)

    outerFunc()()

    val callReference = ::printHello
    callReference()()

    val numberlist = listOf("1", "2", "3")
    numberlist.map{it.toInt()}.forEach{println(it)};


}

val printHello : () -> Unit = {
    println("hello")
    "Hello2"

    println(plusInt(3,4,6))
}

fun call(block: () -> Unit){
    println("call function")
    block()
}

fun printNo() = println("No")

val printlnMessage : (String) -> Unit
        = { message : String -> println(message)}


val printlnMessage2 : (String) -> Unit
        = { println(it)}

val plusInt = {a:Int, b:Int , c:Int -> a + b + c}

fun forEachStr(collections: Collection<String>, action: (String) -> Unit){
    for(item in collections){
        action(item)
    }
}

fun outerFunc() : () -> Unit = { println("이것은 익명함수입니다")}

