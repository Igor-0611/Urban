import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope {
    println()

    val person1 = Person("Иванов", 25)
    val person2 = Person("Петров", 27)
    val person3 = Person("Сидоров", 31)
    val person4 = Person("Денисов", 34)
    val person5 = Person("Кмелин", 37)

    val weather1 = Weather("Подольск", "солнечно", 23)
    val weather2 = Weather("Реутов", "облачно", 21)
    val weather3 = Weather("Коломна", "солнечно", 22)
    val weather4 = Weather("Тула", "облачно", 20)
    val weather5 = Weather("Орёл", "дождь", 19)

    val randoms = listOf(8, 10, 16, 25, 33, 48, 57, 66, 72, 81, 94)
    val personList = listOf(person1, person2, person3, person4, person5)
    val weatherList = listOf(weather1, weather2, weather3, weather4, weather5)

    println("«Программа загрузки данных»")
    var random = listOf(randoms.size, { })
    var person = listOf(personList.size, { })
    var weather = listOf(weatherList.size, { })

    val tasks = listOf(
        launch { random = getData(randoms) },
        launch { person = getData(personList) },
        launch { weather = getData(weatherList) }
    )
    tasks.joinAll()

    println()
    println("«Данные загружены»")
    println(random)
    println(person)
    println(weather)

    println()
    println("«Программа завершена»")
}

private suspend fun <T> getData(data: List<T>): List<T> {
    val list = mutableListOf<T>()
    data.forEach {
        delay(1000L)
        println(it)
        list.add(it)
    }
    return list
}

data class Person(val name: String, val age: Int) {
    
}

data class Weather(val city: String, val description: String, val temp: Int) {

}