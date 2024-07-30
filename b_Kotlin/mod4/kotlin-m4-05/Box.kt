class Box(val width:Double, val height:Double, val depth:Double){

    fun vOfBox():String {
        var V = width * height * depth
        return "Объём коробки V = $V куб.м."
    }
}