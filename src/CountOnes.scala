import scala.io.StdIn.readInt


object CountOnes {
  def main(args: Array[String]) {
    val n = readInt()
    println(n.toBinaryString.count(_.equals('1')))
  }
}