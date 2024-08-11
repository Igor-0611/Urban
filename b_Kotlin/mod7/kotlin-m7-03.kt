
fun main() {
    println()
    val num1 = 120.75
    val num2 = 32.25

    println("$num1 + $num2 = ${num1 add num2}")
    println("$num1 - $num2 = ${num1 subtruct num2}")
    println("$num1 * $num2 = ${num1 multiply num2}")
    println("$num1 / $num2 = ${num1 divide num2}")
    println("---------------------------------------")
    val ivan = Person("Иван")
    ivan say "До свидания."
    println("---------------------------------------")
    val point1 = Point(3.72, 12.21, 1)
    val point2 = Point(3.72, 9.16, 2)
    val point3 = Point(4.23, 9.16, 3)

    point1.printPoint()
    point2.printPoint()
    point1 isRightOf point2.x
    point1 isAbove point2.y
    point3.printPoint()
    point2 isRightOf point3.x
    point2 isAbove point3.y
}

infix fun Double.add(value: Double): Double {
    return this + value
}

infix fun Double.subtruct(value: Double): Double {
    return this - value
}

infix fun Double.multiply(value: Double): Double {
    return this * value
}

infix fun Double.divide(value: Double): Double {
    return this / value
}
//-----------------------------------------------------------
class Person(val name: String) {
    infix fun say(words: String){
        println("$name сказал: $words")
    }
}
//-----------------------------------------------------------
data class Point(val x: Double, val y: Double, val n: Int) {
    fun printPoint() = println("Координаты точки №$n - $x, $y")
}

infix fun Point.isRightOf(xp: Double) {
    if (xp > x) println(" правее точки №$n;")
    else if (xp < x) println(" левее точки №$n;")
    else println(" совпадает по оси X с точкой №$n;")
}

infix fun Point.isAbove(yp: Double) {
    if (yp > y) println(" выше точки №$n.")
    else if (yp < y) println(" ниже точки №$n.")
    else println(" совпадает по оси Y с точкой №$n.")
}
