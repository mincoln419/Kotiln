fun getStr():Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {
//    val result = try {
//        getStr()
//    }catch (e: Exception){
//        println(e.message)
//        "기본값"
//    }

//    val result = runCatching { getStr() }
//        .getOrElse {
//            println(it.message)
//            "기본값"
//        }
//    val result = runCatching { getStr() }
//        .getOrNull()

//    val result = runCatching { getStr() }
//        .exceptionOrNull()
//    result?.let{
//        println(it.message)
//        throw it
//    }

//    val result = runCatching { getStr() }
//        .getOrDefault("기본값")
//
//    println(result)

//    val result = runCatching { getStr() }
//        .getOrThrow()
//
//    println(result)

//    val result = runCatching { "안녕" }
//        .map {
//
//            "${it}하세요"
//        }.getOrThrow()
//    println(result)

//    val result = runCatching { "안녕" }
//        .mapCatching {
//            throw Exception("예외")
//        }.getOrDefault("기본 값")

//    val result = runCatching { getStr()}
//        .recover { "복구" }
//        .getOrNull()

    val result = runCatching { getStr()}
        .recoverCatching {

            throw Exception("예외")
        }
        .getOrDefault("기본값")
    println(result)
}
