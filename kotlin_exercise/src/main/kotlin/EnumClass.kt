enum class PaymentStatus (val label: String) : Payable{
    UNPAID("미지급"){
        override fun isPayable(): Boolean = true
    }, PAID("지급완료"){
        override fun isPayable(): Boolean = false
    }, FAILED("지급실패"){
        override fun isPayable(): Boolean = false
    }, REFUNDED("환불"){
        override fun isPayable(): Boolean = false
    };


}

interface Payable {
    fun isPayable() : Boolean
}

fun main() {
//    if(PaymentStatus.UNPAID.isPayable()){
//        println(PaymentStatus.UNPAID.label)
//    }
    
    //java에서 제공하는 value Of를 사용한 인스턴스화
    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)
    
    if(paymentStatus == PaymentStatus.PAID){
        println("결제완료상태")
    }

    //코틀린의 values 를 이요한 인스턴스화

    for(status in PaymentStatus.values()){
        println("[${status.name} - ${status.label}](${status.ordinal})")
    }
}