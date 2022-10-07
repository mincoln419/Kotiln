sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)

}

data class BackendDeveloper(override val name: String) : Developer(){

    override fun code(language: String) {
        println("저는 백엔드 개발자 입니다 ${language}를 사용합니다")
    }
}

data class FrontendDeveloper(override val name: String) : Developer(){

    override fun code(language: String) {
        println("저는 프론트엔드 개발자 입니다 ${language}를 사용합니다")
    }
}

data class AndroidDeveloper(override val name: String) : Developer(){

    override fun code(language: String) {
        println("저는 안드로이드 개발자 입니다 ${language}를 사용합니다")
    }
}

object OtherDevleoper : Developer(){
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }


}

fun main() {
    val backendDeveloper = BackendDeveloper(name ="토니")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name ="잭슨")
    DeveloperPool.add(frontendDeveloper)

    val androidDeveloper = AndroidDeveloper(name = "웬디")
    DeveloperPool.add(androidDeveloper)

    println(DeveloperPool.get("잭슨"))
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is AndroidDeveloper -> pool[developer.name] = developer
        is OtherDevleoper -> pool[developer.name] = developer
        }

    fun get(name: String) = pool[name]

}