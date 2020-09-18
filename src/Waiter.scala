import scala.collection.mutable.ArrayBuffer

class Waiter(name: String, order: List[String]) {

  println("My name " + name)

  var dishes: ArrayBuffer[String] = ArrayBuffer[String]()

  def giveMe(dish: String): Waiter ={
    dishes += dish
    this
  }

  def complete(): List[String] = {
    dishes.toList
  }
}
