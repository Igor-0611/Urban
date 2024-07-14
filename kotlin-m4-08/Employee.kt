
class Employee(role: String, name: String, surname: String, age: Int, private val s: Int, private val e: Int)
    : Person(role, name, surname, age) {

    override fun actStart(): String {
        return "начинает деятельность в $s"
    }

    override fun actEnd(): String {
        return "заканчивает деятельность в $e"
    }
}