package example.myapp

interface FishColor {
    val color: String

}
interface FishAction {
    fun eat()
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}