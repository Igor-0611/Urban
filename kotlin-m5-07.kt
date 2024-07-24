
fun main() {
    println()
    println(action("светло", "зелёный", ::mix))
    println(action("тёмно", "красный", ::mix))
    println("----------------------------------------")
    val arrNum: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(arrNum.contentToString())
    println(changer(arrNum, ::ones).contentToString())
    println(changer(arrNum, ::twom).contentToString())
}

fun mix(aC: String, bC: String) = aC + bC
fun action(aC: String, bC: String, abc: (String, String) -> String):  String {
    return abc(aC, bC)
}

fun ones(n: Int) = n + 1
fun twom(n: Int) = n * 2
fun changer(arr: Array<Int>, op: (Int) -> Int): Array<Int> {
    val arrc = arr.map {op(it)}
    return arrc.toTypedArray()
}