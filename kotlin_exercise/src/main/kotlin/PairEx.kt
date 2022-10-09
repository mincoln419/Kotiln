fun plus(a: Int, b: Int) = a + b

fun plus(tuple: Tuple) = tuple.a + tuple.b

data class Tuple(val a: Int, val b: Int)

//pair -> 위 튜블을 선언할 필요없이 바로 튜플로 사용가능한 코틀린 클래스

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main(){
    println(plus(1,3))

    println(plus(Tuple(2, 4)))

    println(plus(Pair(9, 1)))

    val pair = Pair("A", 1)
    println(pair)
    println(pair.toList())

    val triple = Triple("A", "B","C")
    println(triple)

    //4개 이상일때는 별도의 자료구조를 만들어야 한다

    val newTriple = triple.copy(third = "D")
    println(newTriple)

    val (a: String, b: String, c: String) = newTriple

    //구조분해할당
    println("$a, $b, $c")

    val list3:List<String> = newTriple.toList()

    val (a1,a2, a3) = list3
    println("$a1, $a2, $a3")

    val map = mutableMapOf("조민건" to "개발자")

    for((key, value) in map){
        println("${key}은 ${value}")
    }

}
