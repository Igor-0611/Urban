import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

class Storage {
    val text = """
        Мартышка к старости слаба глазами стала.
        А у людей она слыхала,
        Что это зло еще не так большой руки.
        Лишь стоит завести Очки.
        Очков с полдюжины себе она достала.
        Вертит Очками так и сяк.
        То к темю их прижмет, то их на хвост нанижет,
        То их понюхает, то их полижет.
        Очки не действуют никак.
        "Тьфу пропасть! - говорит она,- и тот дурак,
        Кто слушает людских всех врак.
        Всё про Очки лишь мне налгали.
        А проку на-волос нет в них".
        Мартышка тут с досады и с печали
        О камень так хватила их,
        Что только брызги засверкали.
        К несчастью, то ж бывает у людей.
        Как ни полезна вещь,- цены не зная ей,
        Невежда про нее свой толк все к худу клонит.
        А ежели невежда познатней,
        Так он ее еще и гонит. 
        """.trimIndent()
}

suspend fun main()= coroutineScope {

    var stringResult = ""
    val channel = getList(getStringList(Storage().text))

    val startTime = System.currentTimeMillis()

    runBlocking{
        channel.consumeEach {
            stringResult += it + "\n"
        }

        val endTime = System.currentTimeMillis()
        val timeTaken = endTime - startTime

        println("\nРезультат получен за $timeTaken мс:\n")
        println(stringResult)
    }
}

fun getStringList(string: String): List<String> = string.lines()

fun CoroutineScope.getList(list: List<String>) : ReceiveChannel<String> = produce {
    for (string in list) {
        delay(10L)
        this.send(string)
    }
    this.close()
}