
fun main() {
    println()
    val array: Array<Int> = arrayOf(2, 4, 7, 1, 2, 4)
    println(array.contentToString())

    println(createMap(array))
    println("----------------------------------------")
    val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна")
    println(people)

    print("Введите удаляемое значение: ")
    val tmp = readln()
    while (people.containsValue(tmp)) people.values.remove(tmp)

    println(people)
    println("----------------------------------------")
    val person1 = Person("Иван", 30, "директор")
    val person2 = Person("Петр", 25, "прораб")
    val person3 = Person("Лида", 20, "бригадир")

    val personHashMap = hashMapOf(1 to person1, 2 to person2, 3 to person3)

    println(personHashMap)
}

fun <T> createMap(array: Array<T>): Map<T, Int> {
    val map = mutableMapOf<T, Int>()
    for (elm in array) {
        if (!map.containsKey(elm)) map[elm] = 1
        else {
            val tmp: Int? = map[elm]
            if (tmp != null) {
                map[elm] = tmp + 1
            }
        }
    }
    return  map
}

data class Person(val name: String, val age: Int, val post: String) {
    override fun toString(): String {
        return ("$post $name $age лет")
    }
}
