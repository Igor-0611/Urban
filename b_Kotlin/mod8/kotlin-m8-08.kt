
fun main() {
    println("--------------------------------")
    val str = listOf("one", "two", "three")
    val strNew =  mutableListOf<String>()

    str.forEach {strNew.add(it.reversed())}

    println(str)
    println(strNew)

    println("--------------------------------")
    val num = listOf(1, 2, 3, 4, 5)
    val numNew = mutableListOf<Int>()

    num.forEach {if (it <= 3) numNew.add(it*it)}

    println(num)
    println(numNew)

    println("--------------------------------")
    val colEng = listOf("red", "blue", "white")
    val colRus = listOf("красный", "синий", "белый")
    var colDic = mutableListOf<String>()

    colEng.zip(colRus).forEach {colDic.add("Значение: ${it.first}, перевод: ${it.second}")}
    println(colEng)
    println(colRus)
    println(colDic)

    println("--------------------------------")
    val months = listOf("Jan", "Feb", "Mar", "Apr", "May")
    var count = 0

    months.forEach {count += it.length}

    println(months)
    println("Общее количество символов = $count")
}