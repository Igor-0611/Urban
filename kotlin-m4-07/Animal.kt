
open class Animal {

    var name: String = ""
    var weight: Double = 0.00

    fun meal(meal: String, time: Int) {
        println(" '$name' (вес $weight кг) ест '$meal' $time раза в день.")
    }
}