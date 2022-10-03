class ClassEx(
    var name: String = "",
    var price: Int = 0,
    var iced: Boolean = false
){
    val brand: String
        get() = "스타벅스"

    var quantity : Int = 0
        set(value){
            if(value > 0 ){
                field = value// field 식별자를 사용하지 않으면 setter를 재귀 호출하게 되어 stack Overflow 발생(무한재귀) - 백킹필드
            }
        }

}


class EmptyClass

fun main() {
    val coffee = ClassEx()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true


    println("${coffee.brand} ${coffee.name} ${coffee.quantity}개 가격은 ${coffee.price}")
}