fun main() {
    println()
    val alligator = Helicopter()
    alligator.name = "Ка-52"
    alligator.weight = 10800 //кг
    alligator.speed = 260 //км/ч
    alligator.height = 4000 //м
    println("Спроектировали вертолет с названием «${alligator.name}»")
    println("скоростью полета ${alligator.speed} км/ч," +
            " весом ${alligator.weight} кг," +
            " высотой полета ${alligator.height} м.")
    //----------------------------------------------------------------
    println()
    val petOne = Pets()
    petOne.type = Pets.Type.DOG
    petOne.name ="Максик"
    petOne.weight = 37.45

    val pet: MutableList<Pets> = ArrayList<Pets>()
    pet.add(petOne)

    println("Домашнее животное: " + pet.get(0).type.str)
    println("Кличка: '" + pet.get(0).name + "'")
    println("Вес: " + pet.get(0).weight + " кг")
    //----------------------------------------------------------------
    println()
    val num = 5.87

    print("Doule $num to Int = ")
    if ((num*10)%10 < 5) println(num.toInt())
    else println(num.toInt()+1)
}