fun main() {
    Thread.currentThread()
    Thread.sleep(1000L)
    
    println("체크드익셉션없음")



    try{
        throw Exception()

    }catch (e: Exception){
        println("오류발생")
    }finally {
        println("finally")
    }

    var a = try{
        "1234".toInt()
    }catch (e: Exception){
        println("예외발생")
    }
    println(a)

    //throw Exception("예외발생")

    //failFast("인자로 넘겨서 오류발생")

    //println("이 메시지는 출력될까?")

    val b: String? = null
    val c = b ?: failFast("예외발생 a is null")

    println(c.length);
}

fun failFast(message: String ) : Nothing {
    throw IllegalArgumentException(message)
}