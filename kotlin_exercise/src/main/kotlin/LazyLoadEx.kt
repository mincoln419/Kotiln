class HelloBot {
    val greeting: String by lazy() {
        println("초기화수행")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    //helloBot.greeting = getHello()

//    helloBot.sayHello()
//    helloBot.sayHello()
//    helloBot.sayHello()

    for(i in 1 .. 10){
        Thread {
            helloBot.sayHello()
        }.start()
    }

    val test= `7_lateInit`()
    test.printText()
    test.printText()

}

class `7_lateInit`{
    lateinit var text : String

    fun printText(){

        if(this::text.isInitialized){
            println("초기화됨")
        }else{
            println("초기화안된상태임")
        }
        text = "안녕-하세요"
        println(text)
    }
}