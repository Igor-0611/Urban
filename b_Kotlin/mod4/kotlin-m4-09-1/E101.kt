
class E101(name: String, phone: Int) : Emergensy(name, phone), Description {

    override fun Description() {
        println("$name вызовается по номеру $phone")
    }

    override fun getDescription() {
        println("Тущит пожары и всех спасает.")
    }
}