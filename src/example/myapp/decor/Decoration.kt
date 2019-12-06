package example.myapp.decor

data class Decoration(val rocks: String) {
}

fun makeDecoration() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    // fun equals() is the same as '==' operator.
    // If wanting to compare the reference between two objects, use '==='
    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
}

fun main() {
    makeDecoration()
}