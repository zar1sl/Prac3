import java.util.Random
fun main(args: Array<String>) {

//1
    val MyAge = 18
    val isTeenager = MyAge in 13..19

//2
    val theirAge = 30
    val bothTeenagers = MyAge in 13..19 && theirAge in 13..19 /*логический оператор && (логическое "и")
     для проверки, являются ли оба возраста в промежутке от 13 до 19*/

//3
    val reader = "Zarina"
    val author = "Richard Lucas"
    val authorIsReader = reader == author // используем оператор равенства == чтобы проверить равны ли значения

//4
    val readerBeforeAuthor = reader < author // определяем следует ли reader перед author по алфавиту

//5
    val myAge2 = 18
    if (myAge2 in 13..19) {
        println("Подросток")
    }
    else {
        println("Не подросток")
    }

//6
    val answer = if (myAge2 > 13 && myAge2 < 19) println("Подросток") else println("Не подросток")
    print(answer)

//7
    var counter = 0
    while (counter<10){
        print(counter)
        counter += 1 // через инкремент прибавляем один
        // цикл продолжается пока counter меньше 10
}
//8
    var roll = 0
    do {
        roll = Random().nextInt(6)
        counter += 1 // через инкремент добавляем один
        print(
            "После $counter бросков, roll равен\n" +
                    "$roll \n" // цикл будет продолжаться пока значение не станет равным 0
        )
    }
    while (roll != 0)

//9
    val range = 1..10
    for (number in range) {
        val square = number * number
        println("Квадрат числа $number равен $square") // в результате будет выведен квадрат каждого числа от 1 до 10
    }

//10
    for (number in range) {
        val squareRoot = Math.sqrt(number.toDouble())
        println("Квадратный корень числа $number равен $squareRoot")
    // в результате будет выведен квадратный корень из каждого числа от 1 до 10
    }
}