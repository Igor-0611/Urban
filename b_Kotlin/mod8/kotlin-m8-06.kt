import java.util.*

fun main() {
    val employee = listOf(
        Employee("Иванов", 37,75000),
        Employee("Антонов",41,83000),
        Employee("Захаров", 27,69000),
        Employee("Петров",32,85000),
        Employee("Елисеев",29,90000),
    )

    println("-------------------------------------------------------")
    println(employee.sortedBy { it.name })
    println(employee.sortedBy { it.age })
    println(employee.sortedBy { it.wage })
    println("-------------------------------------------------------")
    val matrix1 = arrayOf(
        intArrayOf(21, 12, 31, 85),
        intArrayOf(14, 54, 26, 18),
        intArrayOf(73, 38, 19, 63)
    )

    for (row in matrix1) {
        Arrays.sort(row)
    }

    println(matrix1.contentDeepToString())
    println("-------------------------------------------------------")
    val matrix2 = arrayOf(
        intArrayOf(21, 12, 31, 85),
        intArrayOf(14, 54, 26, 18),
        intArrayOf(73, 38, 19, 63)
    )

    var cnt = 0
    for (row in matrix2) {
        for (i in 1 until row.size - 1) {
            if ((row[i] - row[i-1]) * (row[i + 1] - row[i]) >= 0) {
                println(row.contentToString())
                cnt++
                break
            }
        }
    }
    println("Количество пилообразных массивов = $cnt")
    println("-------------------------------------------------------")
}

class Employee(val name: String, val age: Int, val wage: Int) {
    override fun toString(): String = "$name - $age - $wage"
}