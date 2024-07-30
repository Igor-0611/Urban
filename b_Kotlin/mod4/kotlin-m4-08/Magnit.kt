import kotlin.math.round

class Magnit(name: String, p22: Double, p23: Double) : Shop(name, p22, p23) {

    override fun getProfit(): Double {
        return round((p23 - p22)*100)/100
    }

    override fun getCnt(): Double {
        return round((p23 / p22)*100)/100
    }
}