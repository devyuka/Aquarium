package example.myapp.decor

data class Decoration(val rocks: String){
}

data class Decoration2(val rocks: String, val wood: String, val driver:String)

fun makeDecorations(){
    val decoration1 = Decoration("grantie")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    val d5 = Decoration2("crystal","wood", "driver")
    println(d5)

    val (rock, _, driver) = d5
    println(rock)
    //println(wood)
    println(driver)
}

fun main() {
    makeDecorations()
}