import java.util.TreeSet

fun main() {
    println()
    val number = setOf(21, 24, 32, 37, 44, 49, 53, 52, 66, 67, 87, 84, 91, 98)
    val evenNum: MutableSet<Int> = mutableSetOf()
    val oddNum: MutableSet<Int> = mutableSetOf()

    for (elm in number) {
        if (elm % 2 == 0) evenNum.add(elm)
        else oddNum.add(elm)
    }

    println(number)
    println(evenNum)
    println(oddNum)
    println("-------------------------------------------------------")
    val number2 = setOf(5, 9, 15, 19, 23, 25, 34, 40, 46, 55, 64, 70, 81, 85)
    val multiNum: MutableSet<Int> = mutableSetOf()

    var tmp = 0
    for (elm in number2) {
        tmp = elm * 2
        if (tmp % 5 == 0) multiNum.add(tmp)
    }

    println(number2)
    println(multiNum)
    println("-------------------------------------------------------")
    val collection = listOf(5, 9, 5, 19, 25, 25, 34, 40, 55, 55, 64, 70, 81, 81)

    val newset = removeDuplicates(collection)

    println(collection)
    println(newset)
    println("-------------------------------------------------------")
    val arrnum = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)

    println(arrnum.contentToString())

    var k = 0
    for (elm in arrnum) if (elm != 0) arrnum[k++] = elm
    for (i in k..<arrnum.size) arrnum[i] = 0

    println(arrnum.contentToString())
}

fun <T> removeDuplicates(collection: Collection<T>?): Collection<T> {
    return TreeSet(collection)
}

