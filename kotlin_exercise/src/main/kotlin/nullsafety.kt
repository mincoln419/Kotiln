fun main() {
    var a : String? = null
    println(a?.length)

    var b : Int = if(a != null)a.length else 0
    println(b)

    //엘비스 연산자 -.. 구렛나룻;
    val c = a?.length ?: 0
    println(c)

    val nullableStr = getNullstr()

    val nullableStringLength = nullableStr?.length

    println(nullableStringLength)

    println(getLengthIfNotNull(nullableStr))
}

fun getNullstr() : String? = null
fun getLengthIfNotNull(str: String?) = str?.length ?: "null인 경우 반환"

