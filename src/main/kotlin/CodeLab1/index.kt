package org.example.CodeLab1


val i: Int = 6
val b2: Byte = 1 // OK, los literales se verifican estáticamente
val b1 = i.toByte()
val i4: Int = b2.toInt() // OK!
val i5: String = b2.toString()
val i6: Double = b2.toDouble()
var fish: Int = 12
var lakes: Double = 2.5
val numberOfFish = 50
val numberOfPlants = 23

fun printHello() {
    println("Hello World")
}

fun main() {
    printHello()

    println("********")

    println("b1: $b1") // Conversión de Int a Byte
    println("b2: $b2") // Byte literal
    println("i4 (b2 a Int): $i4") // Conversión de Byte a Int
    println("i5 (b2 a String): $i5") // Conversión de Byte a String
    println("i6 (b2 a Double): $i6") // Conversión de Byte a Double

    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    println("********")

    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    if (numberOfFish in 1..100) {
        println("The number of fish ($numberOfFish) is in the range of 1 to 100.")
    }

    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    println("********")

    var marbles: Int? = null
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    println("Fish food treats after dec: $fishFoodTreats")

    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println("Fish food treats after Elvis operator: $fishFoodTreats")

    var nullableString: String? = null
    try {
        val len = nullableString!!.length
    } catch (e: NullPointerException) {
        println("Caught a NullPointerException!")
    }

    println("********")

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

    val fishArray = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(fishArray))

    val mixArray = arrayOf("fish", 2)
    println(mixArray.joinToString())

    val intArray = intArrayOf(1, 2, 3)
    val combinedArray = intArrayOf(4, 5, 6) + intArray
    println(combinedArray.joinToString())

    println("********")

    for (element in fishArray) {
        print("$element ")
    }
    println()

    for ((index, element) in fishArray.withIndex()) {
        println("Item at $index is $element")
    }

    for (i in 1..5) print(i)
    println()

    for (i in 5 downTo 1) print(i)
    println()

    for (i in 3..6 step 2) print(i)
    println()

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water")

    repeat(2) {
        println("A fish is swimming")
    }
}