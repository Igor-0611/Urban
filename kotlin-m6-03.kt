
fun main() {
    println()
    val a: Int = 10 //-> {10}
    val b: String = "Hello" //-> [Hello]
    val c: List<Int> = listOf(10, 16, 3) //-> "[10, 16, 3]"
    val d = 'f' //-> (f)

    printer(a)
    printer(b)
    printer(c)
    printer(d)
    println("----------------------------")
    val tInt = 89296056565
    val tStr = "89296056565"

    val pers1 = Person("Ivan", tInt)
    val pers2 = Person("Petr", tStr)

    println("${pers1.name}: ${pers1.num}")
    println("${pers2.name}: ${pers2.num}")
    println("----------------------------")
    println(packager(a,'"'))
    println(packager(b,'"'))
    println(packager(c,'"'))
    println(packager(d,'"'))
}

fun <T> printer(value: T) {
    println(value)
}

class Person<T>(val name: String, val num: T) {}

fun <T> packager(value: T, char: Char): String {
    var pack = ""

    if (value is Int) pack = "{$value}"
    else if (value is String) pack = "[$value]"
    else if (value is Char) pack = "'$value'"
    else pack = "$char$value$char"

    return pack
}