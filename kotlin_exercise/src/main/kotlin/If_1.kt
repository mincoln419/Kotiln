fun main(){
    
    //if.else 사용
    val job = "Software Developer"
    
    if(job == "Software Developer"){
        println("개발자")
    }else{
        println("개발자 아님")
    }
    
    //코틀린의 if..else는 표현식이다 - 3항 연산 자체가 불필요함
    val age : Int = 10
    
    val str = if(age > 10){
        "성인"
    }else{
        "아이"
    }


}