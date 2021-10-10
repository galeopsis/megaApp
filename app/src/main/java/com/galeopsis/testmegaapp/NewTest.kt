package com.galeopsis.testmegaapp

fun main() {
    /*val a = "aaa"
    val b = "bbb"
    val c = 'c'

    println("test")
    println("$a $b $c")
    println(a + b)
    println(a + c)

    val s = a + b + c
    println(s.lowercase())
    println(s.uppercase())
    println(s)*/

    /*val cats = listOf("Мурзик", "Барсик", "Рыжик")
    val cat = cats.getOrNull(1) ?: "Неизвестный котик"
    val cat2 = cats.getOrNull(4) ?: "Неизвестный котик"
    println("cats size is: ${cats.size}") //cats size is: 3
    println(cat)        //Барсик
    println(cat2)       //Неизвестный котик
    println(cats[2])    //Рыжик
    println(cats)       //[Мурзик, Барсик, Рыжик]*/

    /*val myArray = arrayOf(1, 2, 3, "sss")
    val sss = myArray[3]
    val ddd = "bellaDura"
    val rndSSS = (Math.random() * myArray.size).toInt()
    println("myArray: $sss array size is: ${myArray.size} rndIndex = ${if (rndSSS < 2) rndSSS else "$ddd $rndSSS"}") //myArray: sss array size is: 4 rndIndex = bellaDura 2*/

    /* val rnd = (1..10).random()
     val a = (1..10).random()
     val b = (1..10).random()
     val fruits = arrayOf("apple", "melon", "grape", "banana")
     val randomFruit = fruits.random()
     val aaa = sumInts(a, b, rnd, randomFruit)
     println(
         "test: $a + $b = ${sumNumbers(a, b)}, ${sumNumbers(a,b)} + $rnd (random) = $aaa, fruit = $randomFruit ")
     println("$a + $b = ${sumNumbers(a, b)}")*/

//    println(isNotDigit('1')) // false, это всё-таки цифра

   /* val daysOfWeek =
        listOf(
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        )
    daysOfWeek.forEach { println(it) }

    daysOfWeek.forEachIndexed { index, element ->
        println("$index : $element")
    }*/

    val xxx = TestClass("test")
    xxx.printTest()
    xxx.str = "ddd"
    println("str is ${xxx.str} now")

    val yyy = TestClassSecond(2,3)
    println(yyy.firstParam)
    println(yyy.secondParam)
    println("${yyy.firstParam},${yyy.secondParam}")

}
//***********************fun section*******************************

/*fun sumNumbers(x: Int, y: Int): Int {
    return x + y
}

fun sumInts(a: Int, b: Int, rnd: Int, randomWord: String): Float {
    val sum = a + b
    val sum2 = sum.toFloat()
//    println(("$a + $b = $sum, random number is $rnd and $sum divided by $rnd is ${(sum2 / rnd)} and the random fruit is $randomWord"))
    return sum2 + rnd
}*/

//fun isNotDigit(c: Char) = c !in '0'..'9'
