class Car(val mark: String, val name: String) {

    var weigth = 0
    var speed = 0
    constructor(mark: String, name: String, weigth: Int, speed: Int): this(mark, name) {
        this.weigth = weigth
        this.speed = speed
    }

    fun drive (speed: Int) {
        println("$mark $name (масса $weigth кг) движется со скоростью $speed км/ч.")
    }

    fun stop() {
        println("$mark $name (масса $weigth кг) не движется.")
    }
}