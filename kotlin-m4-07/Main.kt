
fun main() {
    println()
    val dog = Dog()
    dog.name = "Максик"
    dog.weight = 37.45
    print(dog.toString())
    dog.meal("Чаппи", 2 )
    dog.act()

    println()
    val cat = Cat()
    cat.name = "Васька"
    cat.weight = 3.8
    print(cat.toString())
    cat.meal("Китекат", 4)
    cat.act()
    //-----------------------------------------
    println()
    var mode = 0

    val nokia = Nokia()
    nokia.type = "Смартфон"
    nokia.brand = "Nokia"
    nokia.part = "G21"
    nokia.ram = 6
    nokia.rom = 128
    mode = nokia.mode()
    println(nokia.toString() + nokia.ring(mode))

    println()
    val sony = Sony()
    sony.type = "Смартфон"
    sony.brand = "Nokia"
    sony.part = "Xperia 10 V"
    sony.ram = 8
    sony.rom = 128
    mode = sony.mode()
    println(sony.toString() + sony.ring(mode))
    //----------------------------------------------------
    println()
    val arr = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    for (i in 0 until arr.size) if (arr[i]%5 == 0) print("${arr[i].toString()}, ")
    println()
}