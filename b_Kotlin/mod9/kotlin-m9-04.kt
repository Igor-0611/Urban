import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.system.exitProcess

data class Person(val name: String, val salary: Int)

val personList = mutableListOf<Person>()
val resultList = mutableMapOf<Person, Int>()

class PersonManager {
    fun addPerson(person: Person) {
        personList.add(person)
    }
}

suspend fun addPassword(person: Person) {
    val password = Random.nextInt(100000, 999999)
    runBlocking {
        delay(500L)
        resultList[person] = password
    }
}

suspend fun readDataPersonList() {
    runBlocking {
        for (elm in resultList) {
            delay(1000L)
            println("Сотрудник: ${elm.key}; пароль: ${elm.value}")
        }
    }
}

suspend fun main() = coroutineScope{
    println()
    println("Программа работы с базой данных сотрудников")
    delay(1000L)
    var add = false

    while (!add) {
        println("Добавить сотрудника:\n1. Да\n2. Нет")
        val select = readln()

        when (select) {
            "1" -> add = true
            "2" -> {
                println("Завершение программы")
                exitProcess(0)
            }
            else -> {
                println("Некорректный ввод. Повторите попытку.")
            }
        }
    }

    runBlocking {
        delay(1000L)
        var continueAdding = true
        val personManager = PersonManager()

        while (continueAdding) {
            println("Добавить сотрудника:\n1. Да\n2. Прочитать базу данных")
            val choice = readln()

            when (choice) {
                "1" -> {
                    println("Введите имя сотрудника:")
                    val name = readln().takeIf { it.isNotEmpty() } ?: "No Name"
                    println("Введите зарплату сотрудника:")
                    val salary = readln().toIntOrNull() ?: 0

                    val newPerson = Person(name, salary)
                    personManager.addPerson(newPerson)

                    println("Сотрудник добавлен.")
                }
                "2" -> {
                    println("Чтение базы данных:")
                    for (person in personList) addPassword(person)
                    readDataPersonList()
                    continueAdding = false
                }
                else -> {
                    println("Некорректный ввод. Повторите попытку.")
                }
            }
        }
    }

    val job = GlobalScope.launch {
        while (true) {
            println("Завершение программы - 0")
            if (readln() == "0") {
                println("Завершение полной работы")
                break
            }
            else println("Некорректный ввод.")
        }
    }

    runBlocking {
        job.join()
    }
}