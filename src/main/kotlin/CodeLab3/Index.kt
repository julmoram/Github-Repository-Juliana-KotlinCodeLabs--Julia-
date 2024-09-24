package org.example.codelab3
//modificacion para hacer commit en el main


fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    println("-------")

    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    // default width
    println("-------")
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    // everything custom
    println("-------")
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    println("-------")
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()

    println("-------")
    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printSize()

    println("****************")
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {

    val fishList = listOf(Shark(), Plecostomus(), Plecostomus(GoldColor))


    val twoLists = fishList.partition { isFreshWater(it) }
    println("freshwater: ${twoLists.first.map { it.color }}")
    println("saltwater: ${twoLists.second.map { it.color }}")


    val equipment = "fish net" to "catching fish"
    println("${equipment.first} is used for ${equipment.second}")


    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())


    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")


    val (tool, use) = equipment
    println("$tool is used for $use")


    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
}

fun main() {
    buildAquarium()
    println("****************")
    makeFish()
    println("****************")
    makeDecorations()

}