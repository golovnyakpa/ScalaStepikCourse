trait Animal {
  val sound: String
  def voice: Unit = println("voice: " + sound)
}

case class Cat(override val sound: String = "Meow!") extends Animal

case class Dog(override val sound: String = "Woof!") extends Animal

case class Fish(override val sound: String = "Fishes are silent!") extends Animal {
  override def voice = println(sound)
}

//object Main extends App {
//  val animals = Seq(new Cat, new Dog, new Fish)
//  animals.foreach(_.voice)
//}