
abstract class Shop(val name: String, val p22: Double, val p23: Double) {

    abstract fun getProfit(): Double
    abstract fun getCnt(): Double

    fun getInfo() {
        println("Сеть '$name' данные (млрд руб.):")
        println("прибыль 2022 - $p22; прибыль 2023 - $p23;")
        print("разница/коэффициент - ")
    }

}