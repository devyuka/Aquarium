package example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}

//class Shark: AquariumFish() {
//    override val color = "gray"
//}

//class Plecostomus: AquariumFish() {
//    override val color = "gold"
//}

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

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}