class Dog : Animal() {

    fun act() {
        println("Когда голодная - подходит и печально смотрит.")
    }

    override fun toString(): String {
        return "Собака"
    }
}