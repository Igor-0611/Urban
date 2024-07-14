
fun main() {
    println()
    val magnit = Magnit("Магнит", 27.9, 58.6)
    magnit.getInfo()
    println("${magnit.getProfit()}/${magnit.getCnt()}")
    println()
    val pyaterochka = Pyaterochka("Пятёрочка", 52.49, 90.28)
    pyaterochka.getInfo()
    println("${pyaterochka.getProfit()}/${pyaterochka.getCnt()}")
    //--------------------------------------------------------------
    println("---------------------------------------")
    val student = Student("студент", "Иван","Сидоров", 19, 9, 15)
    student.getInfo()
    println(student.actStart())
    println(student.actEnd())
    println()
    val employee = Employee("рабочий", "Пётр","Иванов", 20, 8, 17)
    employee.getInfo()
    println(employee.actStart())
    println(employee.actEnd())
    //--------------------------------------------------------------
    println("---------------------------------------")
    val n1 = "дм"
    val n2 = "км"
    val n3 = "м"
    val n4 = "мм"
    val n5 = "см"

    val line = 31.52
    val unit = 2

    print("$line м = ")
    when (unit) {
        1 -> println("${line*10} $n1")
        2 -> println("${line/1000} $n2")
        3 -> println("${line} $n3")
        4 -> println("${line * 1000} $n4")
        5 -> println("${line * 100} $n5")
    }
}