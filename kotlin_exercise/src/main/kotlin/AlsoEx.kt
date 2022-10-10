class User(val name: String, val password: String){
    fun validation(){
        if(name.isNotEmpty() && password.isNotEmpty()){
            println("검증 성공!")
        }else{
            println("검증 실패!")
        }
    }

    fun printName() = println(name)
}

fun main() {
    User(name = "tony", password = "1234").also {
        it.validation()
        it.printName()
    }


    val hello = "hello"
    val hi = "hi"

    hello.let {a: String ->
//        println(a.length)
        hi.let {b: String ->
            println(a.length)
            println(b.length)
        }

    }

}