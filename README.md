# Android-разработчик \<Urban University\>

# Java

## Модуль №1. Вводный модуль.

## Модуль №2. Синтаксис языка.

### 1.“Inheritance”

#### [lesson-m2-01](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-01)

1. Создать класс Sportsman с полями строкового типа name, team, поле age – целое число, все поля отмечены модификатором private. Создать конструктор класса и методы get для доступа к полям класса. В классе есть метод, описывающий общее действие спортсмена.  
2. Создать классы наследники Footballer, HockeyPlayer, Skier. В каждом из них написать свой дополнительный (относящийся к конкретному классу) метод, например, у класса Footballer может быть метод scoringGoals, характеризующий результативную игру забиванием голов, у  других классов методы будут свои.  
3. В классе с методом main создать экземпляры классов – наследников, по 2 на каждый класс. Вывести информацию о каждом экземпляре класса и действие всех имеющихся методов.

### 2."Абстрактные классы."

#### [lesson-m2-02-1](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-02-1)

1. Напишите программу для создания абстрактного класса **Instrument** с абстрактными методами **play()** и **tune()**. Создайте подклассы для **Guitar** и **Piano**, которые расширяют класс **Instrument** и реализуют соответствующие методы для игры и настройки каждого инструмента.

#### [lesson-m2-02-2](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-02-2)

2. Напишите программу для создания абстрактного класса **Bird** с абстрактными методами **fly()** и **makeSound()**. У класса Bird имеется поле, характеризующее скорость полета **flySpeed**. У класса **Bird** есть конструктор. Создайте подклассы **Eagle** и **Hawk**, расширяющие класс **Bird**, и реализуйте соответствующие методы для описания того, как каждая птица летает и издает звуки.

### 3."Интерфейсы"

#### [lesson-m2-03](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-03)

1. Создать классы Human, Fish, Bird с полями имени, возраста (можно добавить любые поля по своему усмотрению). Создать интерфейс Swimmable с методом, описывающим возможность плавать – swim. Созданные выше классы должны наследоваться от этого интерфейса, реализация метода у каждого класса будет своя, например, у человека – умеет плавать техникой брасс. Создать интерфейс Flyable с методом fly. Наследовать от этого интерфейса те классы, которые могут в той или иной мере выполнять полет. В классе с методом main создать экземпляры классов Human, Fish, Bird, вызвать у этих экземпляров имеющиеся методы.

### 4."NestedInner"

#### [lesson-m2-04](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-04)

1. Создать класс **Car**(Машина). Написать поля **carBrand** (марка автомобиля), **speed**(скорость), **weight**(вес). Написать внутренние классы, характеризующие составные части автомобиля, например, **Engine** (двигатель) с методами, описывающими поведение данного класса. Создать не менее двух локальных классов со своими методами, описывающими их деятельность, например, у класса **Engine** в методе **isRunning**(работать) может быть создан класс **Piston** (Поршень) с методом преобразования энергии горения топлива в механическую энергию

### 5."Exception"

#### [lesson-m2-05.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-05.java)

1. Напишите метод, который принимает целое число в качестве параметра и выдает исключение, если число нечетное. Необходимо протестировать ее в методе main с разными числами.  
2. Напишите метод, который принимает строку в качестве входных данных и выдает исключение, если строка содержит числа

### 6."File"

#### [lesson-m2-06](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-06)

1. Необходимо написать программу, которая дописывает файл. Программа предлагает записать данные фразой "Вводите данные для записи". После того, как введены данные в консоль (необходимо использовать класс Scanner для ввода данных в консоль), программа предлагает дополнить информацию фразой «Введите что-нибудь еще» и данные можно дописать. Вся работа по заполнению файла ведется в бесконечном цикле. Если пользователь введет 0, программа завершается строкой «Файл создан»

### 7."Generics, autoboxing, autounboxing"

#### [lesson-m2-07.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-07.java)

1. Напишите метод, который принимает два массива одного типа и проверяет, содержат ли они одинаковые элементы в одном и том же порядке.  
2. Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.

### 8."Set. HashSet. LinkedHashSet. TreeSet"

#### [lesson-m2-08.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-08.java)

1. Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо. Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.  
2. Создайте множество целых чисел. Необходимо вывести в консоль все его элементы, которые больше 15 и являются четными. Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2

### 9."Collection List ArrayList LinkedList"

#### [lesson-m2-09.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-09.java)

1. Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String. Напишите метод для поиска элемента в списке , содержащем эти цвета. На вход метод принимает параметр поиска. Например, если список содержит «red», «blue», «green» и в аргументы метода передать «red», то метод должен вернуть true, символизируя то, что этот цвет содержится в списке.  
2. Создайте LinkedList, содержащий целые числа, т.е. Integer. Напишите метод, который меняет местами первый и последний элементы этого списка и возвращает этот список в новом виде. Т.е., если создали список \[1, 2, 3, 4, 5\], то в результате должны получить \[5, 2, 3, 4, 1\].

### 10."Коллекции. Map.HashMap.TreeMap"

[lesson-m2-10.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-10.java)

1. Создайте HashMap c ключами Integer, значениями – String. Напишите метод, который возвращает набор ключей, содержащихся в этой карте.  
2. Создайте HashMap c ключами Integer, значениями – String. Напишите метод, который возвращает ассоциативный массив, состоящий из элементов исходного map, при условии, что туда войдут элементы с длиной строки более 3\.  
   Т.е. исходный map: \[1="Red",2="Green",3="Black"\].  
   Новый map: \[2="Green",3="Black"\].

### 11."Enum"

[lesson-m2-11](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-11)

1. Необходимо написать метод, который возвращает позицию буквы алфавита. Для реализации программы создать enum алфавита.  
2. Написать класс Person с полями имени(name), возраста(age). Для определения пола Person создать enum Gender с соответствующими константами. В классе с методом main создать список объектов Person, состоящий не менее, чем из 10 человек разного пола. Написать метод, возвращающий список объектов класса Person в зависимости от введенного параметра пола, т.е. список мужчин или женщин.

### 12."Анонимные классы и функциональные интерфейсы"

#### [lesson-m2-12.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-12.java)

1. Написать функциональный интерфейс Printable с методом print().  
   В классе с методом main создать несколько анонимных классов с различными реализациями метода print().  
2. Написать функциональный интерфейс Concationble с методом concat(), который объединяет две строковых переменных, передаваемых в параметры метода и возвращает строку. В классе с методом main создать несколько анонимных классов с различными реализациями метода concat().

### 13."Лямбда \- выражения"

#### [lesson-m2-13.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-13.java)

1. Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка.  
2. Напишите программу, реализующую лямбда-выражение для определения самого длинного слова в списке, состоящего из нескольких слов.

### 14."Stream API"

#### [lesson-m2-14](https://github.com/Igor-0611/Urban/tree/main/a\_Java/mod2/lesson-m2-14)

1. Создайте список типа String, например, названия пищевых продуктов. Напишите программу для подсчета количества строк в списке, начинающихся с определенной буквы, с использованием потоков.  
2. Создать класс Person с полями name и age. В классе с методом main создать список, состоящий не менее, чем из 10 объектов класса Person с произвольными данными. Отфильтровать и вывести в консоль объекты Person, возраст которых более 30 лет.

### 15."Stream API 2 часть"

#### [lesson-m2-15.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-15.java)

1. Напишите программу для вычисления суммы всех четных и нечетных чисел в списке с использованием потоков.  
2. Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков.

### 16."Debugger"

#### [lesson-m2-16.java](https://github.com/Igor-0611/Urban/blob/main/a\_Java/mod2/lesson-m2-16.java)

1. Дан массив целых чисел. Найти максимальное число из четных в этом массиве.  
2. Дана строка "Привет, Александр, с праздником, с Новым Годом". Написать программу, которая меняет регистр символов. Т.е. результат должен быть таким:  
   пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ

# Kotlin

## Модуль №3. Kotlin введение. Синтаксис языка.

## Модуль №4. Функции. ООП.

### 1."Функции. Сигнатура, параметры функции, vararg – параметры"

#### [kotlin-m4-01.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod4/kotlin-m4-01.kt)

1. Написать функцию возведения числа **a** в степень **n.**  
2. Написать функцию, которая принимает два целых числа **a** и **b** **(a\<b).** Она вычисляет произведение всех целых чисел от **a** до **b** включительно.  
3. Написать функцию, которая принимает два целых числа **a** и **b.** Результатом работы функции должен быть вычисленный наибольший общий делитель **a** и **b.**

### 2."Возвращаемое значение функции, оператор return"

#### [kotlin-m4-02.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod4/kotlin-m4-02.kt)

1. Написать функцию, на вход которой поступает массив из произвольного количества элементов. Данная функция проверяет, если в массиве локальные минимумы и возвращает число локальных минимумов. *(локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).*  
2. Напишите функцию, в которой проверяется созданный Вами массив целых чисел. Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.  
3. Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы.

### 3."Класс. Члены класса."

#### [kotlin-m4-03](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-03)

1. Создать класс вертолет со свойствами название(имя), взлетный вес, скорость полета, максимальная высота полета. В классе с методом mainсоздать экземпляр этого класса, например, alligator, свойствам задать конкретные значения. Вывести в консоль строку: «Спроектировали вертолет с названием… скоростью полета… весом… высотой полета…»  
2. Написать класс домашнее животное. Свойствами класса будут вес, кличка и принадлежность к определённому типу (коровы, гуси, собаки и так далее), нужно их написать в классе. В классе с главным методом создайте свое домашнее животное. Выведите в консоль:  
3. println("Домашнее животное: " \+ … \+  
              "Кличка: " \+ …. \+  
              "Вес: " \+ …);  
4. Даны переменная с плавающей точкой, равная 5,87. Необходимо привести ее к целочисленному типу.

### 4."Модификаторы доступа"

#### [kotlin-m4-04](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-04)

1. Создать класс Registration с полями email и password. Для этого свойства email написать геттер, который возвращает значение этого поля в верхнем регистре. Для поля password написать сеттер, который контролирует, чтобы длина пароля была не менее 6 символов, иначе выводит сообщение, что не соответствует его длина.  
2. Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4\.  
3. Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.  
4. Написать функцию вывода в консоль положительных элементов массива. Проверка на положительность числа выполняется локальной функцией внутри вышеуказанной.

### 5."Конструкторы класса"

#### [kotlin-m4-05](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-05)

1. Создать класс Box(коробка), у которого есть свойства width, height, depth. Написать функцию вычисления объёма коробки в классе Box. В классе с функцией main создать экземпляр класса Box, в конструктор класса передать свойства, задать им значения, вызвать функцию вычисления объема и вывести его на экран.  
2. Дан набор из N чисел. Найти минимальный и максимальный из элементов данного набора и вывести их.  
3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23\. Вывести на экран элементы массива.  
4. Дано целое число. Вывести его строку-описание вида «отрицательное четное число», «отрицательное нечетное число» «нулевое число», «положительное нечетное число», «положительное четное число». int a \= 34 à «положительное четное число»  
5. Создайте класс Car. В классе есть конструктор с параметрами массы, скорости. В классе с функцией main создайте экземпляр этого класса и задайте там параметры в конструктор. Напишите функции движения и остановки автомобиля.

### 6."Геттеры и сеттеры. Инкапсуляция."

#### [kotlin-m4-06](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-06)

1. Написать класс «Банковская карта». В нем создать свойства номера карты и код карты. В главной функции мы можем получить доступ к номеру карты, но не можем к коду. Есть функция, которая описывает, что данные карты будут доступны после ввода пароля.  
2. Дана переменная a – целое число. Используя составные операторы присваивания необходимо выполнить операции: a увеличить на 7, полученное число уменьшить на 4, далее полученный результат умножить на 2 и найти остаток от деления разделив на 3\.  
3. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа. 753 \-\> 357\.

### 7."Наследование"

#### [kotlin-m4-07](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-07)

1. Создать суперкласс Animal(животное) со свойствами веса и имени. Написать функцию, которая описывает прием пищи животного. Наследовать от него подклассы Dog, Cat, используя все возможности суперкласса. У каждого животного определить по одной своей функции.  
2. Создать классы Nokia и Sony. Наследовать каждый из них от суперклассов Smartphone и IPhone. Создать несколько свойств в суперклассах и функцию звонка.  
3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23\. Вывести на экран элементы массива, которые делятся на 5 нацело.

### 8."Абстрактные классы"

#### [kotlin-m4-08](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-08)

1. Написать абстрактный класс Shop(магазин). Написать несколько свойств класса, две абстрактные функции и одну обычную, характеризующих работу магазина. Создать два класса наследника магазин Magnit и Pyaterochka. Написать реализацию функций.  
2. Написать абстрактный класс Person. В конструкторе передать несколько свойств, например, имени, фамилии, возраста. Написать абстрактные функции, характеризующие деятельность объекта класса и одну или несколько обычных. Создать два класса наследника Student и Employee. Написать реализацию функций.

### 9."Интерфейсы"

#### [kotlin-m4-09-1](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-09-1)

1. Написать абстрактный класс «Службы экстренного реагирования». У него есть свой конструктор, содержащий свойства name и phone. Он содержит функцию, характеризующий его деятельность. Напишите интерфейс, который содержит функцию getDescription, дающую описание той или ной службы или организации.

#### [kotlin-m4-09-2-3.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod4/kotlin-m4-09-2-3.kt)

2. Даны целые положительные числа A и B. Найти их наибольший общий делитель (НОД), используя алгоритм Евклида: НОД(A,B) \= НОД(B, A mod B), если B≠0; НОД(A, 0\) \= A.  
3. Дан набор целых чисел. Найти второе максимальное число.

### 10."Переопределение функций и свойств"

#### [kotlin-m4-10](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod4/kotlin-m4-10)

1. Создать класс Bird(птица). Определить у него несколько свойств, например, тип(пеликанообразные, фламингообразные и тд). Создать в классе свойство, которое будет характеризовать по какому-то явному признаку, например, есть птицы, которые не могут подниматься в воздух или по –другому признаку. Определить функциональность класса птица. Создать несколько классов наследников, которые могут переопределять свойства и функции класса – родителя.  
2. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.  
3. Дана строка «ПриВет, кАк деЛа». Необходимо найти символы, находящиеся в верхнем регистре, вывести их и посчитать их количество.

## 

## Модуль №5. Классы и перечисления в Kotlin.

### 1."Вложенные классы и интерфейсы"

#### [kotlin-m5-01](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod5/kotlin-m5-01)

1. Создать класс Human(человек). В нем создать несколько внутренних классов, например, head(голова), legs(ноги), в каждом из классов напишите функции этой части тела. В главной функции опишите модель человека, вызвав всю функциональность написанных классов.  
2. Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов". Написать программу поиска и вывода на экран элементов массива по вводимым символам.  
3. Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд. Посчитать количество элементов, которые находятся между нулями.

### 2."Data классы"

#### [kotlin-m5-02](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod5/kotlin-m5-02)

1. Написать программу по продаже билетов в кино. Пользователь покупает билет, в который заносятся данные названия фильма, места и времени начала сеанса. Проданные билеты заносятся в массив архива. По желанию можно вывести все проданные билеты на фильм.

### 3."Перечисления"

#### [kotlin-m5-03](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod5/kotlin-m5-03)

1. Написать программу, которая будет включать несколько классов и enum. Ход работы следующий. При запуске среда просит ввести месяц года. После ввода месяца и нажатия на enter, на консоль выводится время года, которому соответствует этот месяц. После этого программа вновь спросит желаете продолжить или закончить программу: 1\. Продолжить; 2\. Закончить программу. Если нажимаем продолжить, то программа вновь просит ввести месяц и цикл повторяется.  
2. Дана строка «Шумоизоляция». Посчитать количество повторяющихся символов.

### 4."Анонимные классы"

#### [kotlin-m5-04](https://github.com/Igor-0611/Urban/tree/main/b\_Kotlin/mod5/kotlin-m5-04)

1. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.  
2. Посчитать сумму элементов побочной диагонали матрицы 4х4.  
3. Написать абстрактный класс Printer со своими свойствами и функциями. В функции main создать несколько объектов Printer.

### 5."Делегирование"

#### [kotlin-m5-05.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod5/kotlin-m5-05.kt)

1. Написать программу перевода числа из десятичной системы в двоичную систему счисления.  
2. Написать программу перевода числа из двоичной системы в десятичную систему счисления.  
3. Написать программу, которая проверяет, является ли слово палиндромом.

### 6."Типы функции"

#### [kotlin-m5-06.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod5/kotlin-m5-06.kt)

1. Написать программу, которая будет вычислять факториал числа с применением рекурсии.  
2. Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.  
3. Дан массив val array \= arrayOf(1, 2, 3, 4, 5, 6, 7). Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию. Т.е. массив на выходе будет такой \[2, 2, 4, 4, 6, 6, 8\].

### 7."Функции высшего порядка"

#### [kotlin-m5-07-1.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod5/kotlin-m5-07-1.kt)

1. Написать функцию высшего порядка action, которая на вход принимает значения двух цветов типа String. Они будут смешиваться в функции, которая на вход поступает в качестве третьего аргумента в action, она же возвращает строку – получившейся цвет. Функция action возвращает результат в виде строки смешанный цвет из двух заданных.

#### [kotlin-m5-07-2.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod5/kotlin-m5-07-2.kt)

2. Написать функции изменения числа: одна – увеличение числа на единицу, вторая – умножение на два. Написать функцию высшего порядка, которая на вход принимает массив целых чисел и вторым параметром функцию, принимающую число и возвращающая число. Функция высшего порядка будет возвращать измененный массив, который будет получаться за счет вызова внутри нее у этого массива функции map, внутри которой будет вызываться функция изменения числа.

### 8."Анонимные функции"

#### [kotlin-m5-08.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod5/kotlin-m5-08.kt)

1. Написать анонимную функцию – поздравление с наступающим новым годом. Ее тип следующий (String, Int) \-\> String. Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют. Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.  
2. Создать массив целых чисел произвольного размера. Написать анонимную функцию isEven, проверяющую число на четность, она возвращает логический тип. Написать функцию checkArrayElement проверки массива и его элементов на четность, она на вход принимает массив и вторым параметром анонимную функцию типа isEven.  
3. Напишите анонимную функцию для объединения двух строк и возврата результата.

## 

## Модуль №6. Лямбда-выражения и преобразования типов.

### 1."Лямбда \- выражения"

#### [kotlin-m6-01.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod6/kotlin-m6-01.kt)

1. Напишите функцию, которая запускает лямбду print() столько раз сколько будет указано в параметре count.Например, чтобы передаваемое сообщение в print() выводилось count раз.  
2. Напишите программу, реализующую лямбда-выражение для вычисления среднего арифметического списка чисел.  
3. Дан массив произвольного набора чисел. Отфильтруйте его, чтобы в нем остались только положительные числа.  
4. Напишите программу, которая реализует лямбда-выражение для работы с массивом целых чисел таким образом, что его четные элементы делятся на 2, нечетные – умножаются на 3\.

### 2."Класс String"

#### [kotlin-m6-02.kt](https://github.com/Igor-0611/Urban/blob/main/kotlin-m6-02.kt)

1. Дана строка «Занятие». Вывести на экран символы, составляющие данную строку.  
2. Нужно осуществить проверку номера телефона. Он должен начинаться с \+7 и содержать 10 цифр, не считая \+7. Если телефон верно введен, выведите true, иначе false.  
3. Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.  
4. Дана строка «kotlin2023course». Подсчитать количество содержащихся в ней цифр.

### 3."Обобщенные классы и функции"

#### [kotlin-m6-03.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod6/kotlin-m6-03.kt)

1. Написать функцию print(), которая на вход может принимать различные типы. Вызвать эту функцию несколько раз, поместив аргументы разных типов.  
2. Создать класс параметризованный класс Person, у которого свойство номера телефона в конструкторе может передаваться по – разному, как в виде числа, так и в виде строки. Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой. Вывести полученную информацию о них. Person: **name \= имя, phone \= телефон**  
3. Написать функцию вывода в консоль переменных разных типов данных. Вторым параметром в функции будет тип Char и будет представлять то, во что будет оборачиваться переменная параметризованного типа, поступающая на вход в качестве первого параметра. Например, переменная Int должна оборачиваться в фигурные скобки. Пример ввода данных и полученного результата должен быть таким:

           **val a: Int \= 10 \-\> {10}**  
           **val b: String \= "Hello" \-\> \[Hello\]**  
           **val c: List\<Int\> \= listOf(10, 16, 3\) \-\> "\[10, 16, 3\]"**  
           **val d \= 'f' \-\> (f)**

### 4."Ограничения обобщений"

#### [kotlin-m6-04.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod6/kotlin-m6-04.kt)

1. Создать обобщенный класс States, который содержит функцию **getAverage()**, возвращающую среднее значение массива чисел. Класс имеет ограничение, работать может только с числовыми значениями, T:Number.  
2. Создать класс по имени **GenericMethod** и обобщенную функцию внутри класса по имени **isItIncluded()**. Функция **isItIncluded()** определяет, является ли объект членом массива. Он может быть использован с любым типом объектов и массивов до тех пор, пока массив содержит объекты, совместимые с типом искомого объекта.

### 5."Исключения"

#### [kotlin-m6-05.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod6/kotlin-m6-05.kt)

1. Создать каталог пользователей вместимостью не более 10 персон.  
   Необходимо написать функцию **createList(list: Array\<String\>)**, в которой нужно вводить имя и фамилию, предлагать пользователю разместить созданного члена каталога на ту или иную позицию в каталоге **list**. Помещать его туда.   
   Программа должна перехватывать исключения на ввод пустого имени и определения места в каталоге, которого не существует. Как пожелание, предлагаю написать свой класс исключений, например, с названием **MyException**.

### 6."Null и nullable \- типы"

#### [kotlin-m6-06.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod6/kotlin-m6-06.kt)

1. Написать функцию, которая выводит в консоль Вашу любимую книгу.  
   Входной параметр – название книги. Если в аргументы передается значение **null**, вывести фразу **«У меня нет любимой книги»**.  
2. Создайте функцию, которая возвращает сколько раз целое число может быть разделено на другое целое число без остатка. Функция должна возвращать null, если результатом деления является не целое число. Назовите функцию **DivideIfWhole**. Дополнительно написать решение, в случае, когда нет ни одного деления без остатка – вывести ноль. Рефакторинг сделать с применением оператора ?:  
3. Дан массив строк **array \= arrayOf("Привет","как", null, "дела")**. Создать новый массив, который будет состоять из элементов массива array, которые не являются **null**. Вывести их в консоль.

### 7."Преобразование типов"

#### [kotlin-m6-07.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod6/kotlin-m6-07.kt)

1. Дана строка, содержащая в себе значение 12.3. Преобразовать ее в целое число, число с плавающей точкой, число в двоичной системе представления и вывести в консоль. Для части преобразований, например, в двоичное представление, необходимо сделать несколько преобразований, чтобы целое число перевести в двоичное.  
2. Написать функцию, которая проверяет чем, является вводимый аргумент строкой, числом, числом с плавающей точкой, символом. Ввод должен быть таким: «Это строка».  
3. Написать функцию, которая на вход принимает типизированный параметр. Если это будет целое число, то в консоль вывести сумму вводимого числа и единицы, если строка \- сумму длины строки и единицы, если массив целых чисел \- сумму элементов массива.Модуль №7. List. Set. Map. Фильтрация.

## Модуль №7. List. Set. Map. Фильтрация.

### 1."Extensions"

#### [kotlin-m7-01.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod7/kotlin-m7-01.kt)

1. Написать функцию расширения возведения в квадрат целого числа.  
2. Написать функцию расширения конкатенации строк.  
3. Написать функцию расширения определения последнего индекса в строке.  
4. Написать функцию получения квадратного корня из целого числа.

### 2."ScopeFun"

#### [kotlin-m7-02.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod7/kotlin-m7-02.kt)

1. Создайте scope – функцию **let**, которая будет вызываться у строки. В лямбда – выражении этой функции выводится в консоль сам объект и длина этой строки.  
2. Создать класс **City**, в конструкторе передается название города и population(население). В главной функции создать его экземпляр, в конструктор передать название, через функцию **apply** объекту назначить население в любом количестве. Всю информацию об объекте, созданного City вывести в консоль.  
3. Дан массив целых чисел. С помощью scope – функции **with** вывести в консоль данный массив, количество элементов массива, сумму элементов массива.

### 3."InfixFun"

#### [kotlin-m7-03.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod7/kotlin-m7-03.kt)

1. Написать четыре инфиксных функции: сложения, вычитания, умножения и деления. В функции main применить их для разных операндов, результат вывести в консоль.  
2. Написать класс **Person**. В конструктор он принимает свойство имени. Внутри класса есть инфиксная функция **say**, которая будет передавать сообщение объекта этого класса, переданное в параметр. Сообщение внутри функции выводится с помощью **println**.  
3. Создать data класс **Point**(точка), характеризующее место объекта. Написать две инфиксные функции, расширяющие этот класс. Они характеризуют расположение одной точки относительно другой – **isAbove**() – описывает ситуацию, когда одна точка выше другой, **isRightOf** – описывает ситуацию, когда одна точка правее другой. В функции main создать два объекта Point и сравнить их расположение, применив вышеуказанные функции.

### 4."List"

#### [kotlin-m7-04.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod7/kotlin-m7-04.kt)

1. Дан список целых чисел. Вывести в консоль первый элемент списка двумя способами: обратившись по индексу, через стандартную функцию first().  
2. Дан список целых чисел. Вывести в консоль среднее арифметическое элементов списка двумя способами: вручную – через цикл, с применением стандартной функции average().  
3. Дан список целых чисел. Вывести в консоль сумму элементов списка двумя способами: вручную – через цикл, с применением стандартной функции sum().  
4. Дан список целых чисел. Вывести в консоль количество элементов списка двумя способами: вручную – через цикл, с применением стандартной функции count().  
5. Дан список целых чисел. Вывести в консоль сумму двух последних элементов списка двумя способами: вручную – через цикл, с применением стандартной функции takeLast().  
6. Дан список целых чисел. Вывести в консоль сумму индексов элементов списка двумя способами: вручную – через цикл, с применением стандартной функции indices().

### 5."Set"

#### [kotlin-m7-05.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod7/kotlin-m7-05.kt)

1. Разбить созданный набор на две коллекции, чтобы в одной содержались четные элементы, в другой – нечетные.  
2. Дан набор целых чисел. Необходимо создать новое множество в который будут помещены элементы прежнего умноженные на два, но с условием, что попадают в набор только элемент кратные пяти после умножения.  
3. Создать функцию removeDuplicates (collection: Collection\<T\>?), которая будет возвращать набор неповторяющихся элементов. Обратите внимание, что в параметры функции передан элемент Collection параметризованного типа.  
4. Дан массив целых чисел. Нужно переместить все нули в конец массива, сохранив порядок остальных элементов. Т.е. исходный массив 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0 Результат: 6, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0

### 6."Map"

#### [kotlin-m7-06.kt](https://github.com/Igor-0611/Urban/blob/main/b\_Kotlin/mod7/kotlin-m7-06.kt)

1. Напишите функцию, которая получает на вход массив элементов типа К (**Generic**) и возвращает **Map\<K**, **Int\>**, где **K** — значение из массива, а Int — количество вхождений в массив. Т.е. массив **val array \= arrayOf(2, 4, 7, 1, 2, 4\)**. Выходные данные: **{1=1, 2=2, 4=2, 7=1}**.  
2. Дан map **val people \= mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна")**. Написать функцию, удаляющую элементы по введенному с клавиатуры значению. Т.е., если набрали «**Петр**» коллекция должна стать такого вида **{1=Иван, 3=Лида, 5=Анна}**  
3. Создать **data** класс **Person**, в конструктор он принимает свойства имени, возраста и должности. В главной функции создать **personHashMap** и заполнить его несколькими элементами, где ключом будет целое число – порядковый номер, значением – объект **Person**. Вывести полученную коллекцию в консоль.

