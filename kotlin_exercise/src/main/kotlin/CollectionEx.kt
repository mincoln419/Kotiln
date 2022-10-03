import java.util.LinkedList

fun main() {


    //immutable
    val curryncyList = listOf("달러", "유로", "원")

    println(curryncyList)
    // add를 할 수 없음
    //curryncyList.add
    
    //mutable
    val mutableCuurencyList = mutableListOf<String>()
    mutableCuurencyList.add("달러")
    mutableCuurencyList.add("유로")
    mutableCuurencyList.add("원")

    println(mutableCuurencyList)


    //immutable set
    val numberSet = setOf(1,2,3,4)

    //mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    //immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    //mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    // 컬렉션 빌더
    val numberList : List<Int> = buildList{
        add(1)
        add(2)
        add(3)
    }

    //밖에서는 immutable
    //numberList.add(5) -> 컴파일에러

    //linkedList
    val linkedList = LinkedList<Int>().apply{
        addFirst(3)
        add(2)
        addLast(1)
    }

    //arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = curryncyList.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }

    println("========================================")
    for(currency in curryncyList){
        println(currency)
    }

    println("========================================")
    curryncyList.forEach{
        println(it)
    }

    //for loop -> map
    val lowerList = listOf("a", "b", "c")

    //for loop 방식
//    val upperList = mutableListOf<String>()
//    for(lowerCase in lowerList){
//        upperList.add(lowerCase.uppercase())
//    }
    val upperList = lowerList.map{it.uppercase()}
    println(upperList)

//    val filteredList = mutableListOf<String>()
//    for(upperCase in upperList){
//        if(upperCase == "A" || upperCase == "C"){
//            filteredList.add(upperCase)
//        }
//    }
    val filteredList = upperList.filter { it == "A" || it == "C" }
    println(filteredList)
    //filter 는 stream api 와 달리 terminal operator 를 사용하지 않아도 그 자체로 collection 객체를 생성
    //-> 만일 여러개의 filter 를 대량 데이터(100만건 이상) 처리에서 사용하는 경우 OOM 오류 발생가능
    //-> 이런 경우는 asSequence 를 통해 다음과 같이 처리 필요 , 다만 100만건 이하의 경우에는 asSequence 안쓰는게 성능이 더 좋을 수 있음

    val neoFilteredList = filteredList
        .asSequence()
        .filter {  it == "A" || it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .toList() //마지막에 terminal operator 사용
    println(neoFilteredList)

}
