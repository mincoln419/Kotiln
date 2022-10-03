class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel{

    var coin : Int

    val weight : String
        get() = "200kg"

    fun add(product: Product)

    //default method
    fun rent () {
        if(coin > 0){
            println("카트를 대여합니다")
        }
    }

    override fun roll(){
        println("바퀴가 굴러갑니다")
    }

    fun printId(){
        println("Cart Id")
    }

}

interface Order{
    fun add(product: Product){
        println("${product.name} 주문이 완료되었습니다")
    }

    fun printId(){
        println("0rder Id")
    }
}



class MyCart(override var coin: Int) : Cart, Order {
    override fun add(product: Product) {
        if(coin < 100)println("코인을 넣어주세요")
        else println("가격 ${product.price} 원의 ${product.name}이(가) 카트에 추가됐습니다")
        
        //주문하기
        super<Order>.add(product)
    }

   //두개의 상위 인터페이스에서 default function이 두개 이상 있다면 구현을 강제하게 된다
    override fun printId() {
       super<Cart>.printId()
       super<Order>.printId()
    }



}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product("장난감", 1000))
    cart.printId()
}