
abstract class Person(val role: String, val name: String, val surname: String, val age: Int) {

    abstract fun actStart(): String
    abstract fun actEnd(): String

    fun getInfo() {
        println("$role $name $surname возраст $age")
    }
}