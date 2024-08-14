
fun main() {
    println()
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    var sumelm = 0
    var sumidx = 0
    for (i in list.indices) {
        sumelm += list[i]
        sumidx += i
    }
    val arg = sumelm / list.size
    val sumtl = list[list.size - 1] + list[list.size - 2]

    println(list)
    println(" первый элемент списка -> ${list[0]} - ${list.first()}")
    println(" среднее арифметическое элементов списка -> $arg - ${list.average().toInt()}")
    println(" сумма элементов списка -> $sumelm - ${list.sum()}")
    println(" количество элементов списка -> ${list.size} - ${list.count()}")
    println(" сумма двух последних элементов списка -> $sumtl - ${list.takeLast(2).sum()}")
    println(" сумма индексов элементов списка -> $sumidx - ${list.indices.sum()}")
}