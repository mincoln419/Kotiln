fun main() {

    val str: String? = "안녕"


    var result = str?.let {
        println(it)

        val abc: String? = "abc"
        abc?.let {
            val def : String? = "def"
            def?.let{
                println("abcdef가 null이 아님")
            }
        }

        1234
    }
    // depth가 많아질 때는 if/else로 하는게 가독성 측면에서 좋아보임

    println(result)


//    val config = DatabaseClient()
//    config.url = "localhost:3306"
//    config.username = "mysql"
//    config.password = "1234"
//    val connected = config.connect()

//    val connected: Boolean = DatabaseClient().let {
//        it.url = "localhost:3306"
//        it.username = "mysql"
//        it.password = "1234"
//        it.connect()
//    }
    val connected: Boolean = DatabaseClient().run {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }

    println(connected)

    var strex = "안녕하세요"

    var length : Int = with(strex){
        length
    }

    println(length)


    val connected2: Boolean = with(DatabaseClient()){
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }

    println("connected2...")
    println(connected2)
}

class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    //DB에 접속하고 Boolean 결과를 반환
    fun connect(): Boolean {
        println("DB 접속 중...")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true
    }
}