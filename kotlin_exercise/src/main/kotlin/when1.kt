import java.awt.Color

fun main(){
    //코틀린의 when 식
    val day = 2

    val result = when(day){
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        6 -> "토요일"
        7 -> "일요일"
        else -> "기타"
    }

    println(result)

    when(getColor()){
        Color.GREEN -> println("green")
        Color.RED -> println("red")
        else -> println("blue")
    }
    
    when(getNumber()){
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1 아님")
    }
}

fun getColor() = Color.RED

fun getNumber() = 2

enum class Golor {
    RED, GREEN
}