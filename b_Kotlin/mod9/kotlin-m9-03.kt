import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val listI = getRandomList(1)
        println(listI)
        val listC = getRandomList('A')
        println(listC)

        val one = async { unpack(listI) }
        val two = async { unpack(listC) }

        println("Общий размер списков ${one.await() + two.await()}")
        println(concatenate(listI, listC))
    }
    println("Общее время затраченных операций $time мс")
}

private fun <T, E> concatenate(list1: List<T>, list2: List<E>): Pair<Int, MutableList<Any>> {
    val size = list1.size + list2.size
    val list: MutableList<Any> = list1.map { i -> i as Any }.toMutableList()
    list.addAll(list2.map { i -> i as Any })
    return Pair(size, list)
}

private suspend fun <T> unpack(data: List<T>): Int {
    var count = 0
    data.forEach {
        delay(1000L)
        println(it)
        count++
    }
    return count
}

private fun getRandomList(data: Int): List<Int> {
    val allInt = 1..100
    return List(10) {allInt.random()}

}

private fun getRandomList(data: Char): List<Char> {
    val allChars = 'A'..'Z'
    return List(10) {allChars.random()}
}
