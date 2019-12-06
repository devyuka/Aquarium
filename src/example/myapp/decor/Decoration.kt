package example.myapp.decor

data class Decoration(val rocks: String) {
}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {
}

fun makeDecoration() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    val (rock1, _, diver1) = d5
    println(rock1)
    println(diver1)
}

fun main() {
    makeDecoration()
}