package org.example.codelab2
import java.util.*    // required import


// Will assign kotlin.Unit
val isUnit = println("This is an expression")

val temperature = 10
val isHot = if (temperature > 50) true else false

val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot", "roronoa", "raiden")

val lazyMap = decorations.asSequence().map {
    println("access: $it")
    it
}

val lazyMap2 = decorations.asSequence().filter {it[0] == 'r'}.map {
    println("access: $it")
    it
}
val eager = decorations.filter { it [0] == 'p' }
val filtered = decorations.asSequence().filter { it[0] == 'p' }
val newList = filtered.toList()


val mysports = listOf("basketball", "fishing", "running")
val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
val mylist = listOf(mysports, myplayers, mycities)     // list of lists

var dirtyLevel = 20
val waterFilter = { dirty : Int -> dirty / 2}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    val food : String
    when (day) {
        "Monday" -> food = "flakes"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }
    return food
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 23, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
fun increaseDirty( start: Int ) = start + 1

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    println("*******")
    println(isUnit)
    println("*******")
    println(isHot)
    println("*******")
    println(message)
    println("*******")
    feedTheFish()
    println("*******")
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
    println("*******")
    println( decorations.filter {it[0] == 'p'})

    println("eager: $eager")
    // lazy, will wait until asked to evaluate

    println("filtered: $filtered")
    // force evaluation of the lazy list

    println("*******")
    println("new list: $newList")
    println("-----")
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
    println("-----")
    println("Flat: ${mylist.flatten()}")
    println("*******")
    println(waterFilter(dirtyLevel))
    println("-----")
    println(updateDirty(30, waterFilter))
    println("-----")
    println(updateDirty(15, ::increaseDirty))
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println("-----")
    println(dirtyLevel)
}