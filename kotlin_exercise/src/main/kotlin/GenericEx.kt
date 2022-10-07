class Mygenerics<out T>(val t: T)
{

}

fun main() {
    val generics = Mygenerics("테스트")

    var list1: MutableList<String> = mutableListOf()

    var list2 = mutableListOf<String>()

    val list3 : List<*> = listOf<String>("테스트")

    val list4 : List<*> = listOf<Int>(1, 2, 3, 4)

    //공변성(out), 반 공변성 - java 의 다운캐스팅과 유사한 개념
    var charGenerics : Mygenerics<CharSequence> = generics

    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1","2"), mutableListOf<String>("3", "4"))
}

class Bag<T> {
    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ){
        to.addAll(from)
    }
}