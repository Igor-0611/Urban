import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlin.system.measureTimeMillis

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
        Тьфу пропасть! - говорит она,- и тот дурак,
        Кто слушает людских всех врак.
        Всё про Очки лишь мне налгали.
        А проку на-волос нет в них.
        Мартышка тут с досады и с печали
        О камень так хватила их,
        Что только брызги засверкали.
        К несчастью, то ж бывает у людей.
        Как ни полезна вещь,- цены не зная ей,
        Невежда про нее свой толк все к худу клонит.
        А ежели невежда познатней,
        Так он ее еще и гонит. 
        """.trimIndent() //Удаляем отступы чтобы строка начиналась с символа
}

suspend fun main() {
    val time = measureTimeMillis {

        var stringResult = ""
        var wordResult = ""
        var charList : List<Char> = listOf()
        var wordList : List<Char> = listOf()

        coroutineScope {
            val channel1 = getList(getStringList(Storage().text))
            val channel2 = modifiedList(channel1)
            val channel3= getList(getWordList(Storage().text))
            val channel4 = modifiedList(channel3)

            channel2.consumeEach {
                stringResult += it
            }

            charList = stringResult.toCharArray().toList()

            channel4.consumeEach {
                wordResult += it
            }

            wordList=wordResult.toCharArray().toList()
        }
        println()
        println("Список всех первых букв строк -> $charList")
        println("Список всех первых букв слов -> $wordList")
    }
    println("Затрачено времени на получение данных: $time  мс")
}

fun getStringList(string: String): List<String> = string.lines()

fun getWordList(string: String):List<String> = string.split("[\\s,!.\\-]+".toRegex())

fun CoroutineScope.getList(list: List<String>) : ReceiveChannel<String> = produce {
    for (string in list) {
        delay(10L)
        this.send(string)
    }
    this.close()
}

fun CoroutineScope.modifiedList(channel: ReceiveChannel<String>): ReceiveChannel<String> = produce {
    channel.consumeEach {
        if (it.isNotBlank()) {
            send(it[0].uppercase())
        }
    }
}