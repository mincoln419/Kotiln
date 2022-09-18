
fun sum1(a: Int, b: Int) {
    a + b
}

fun sum2(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int) : Int {
    return a + b
}

fun printSum(a: Int , b: Int){
    println("$a + $b = ${a + b}")
}

fun greeting(message : String = "안녕하세요"){
    println(message)
}

fun main(){
    greeting()
    greeting("할로")
}