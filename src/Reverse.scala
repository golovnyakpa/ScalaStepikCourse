import scala.io.StdIn.{readf2, readLine}

object Reverse {
  def main(args: Array[String]) {
    val input = readLine()
    val positions = input.split(" ")
    val startIndex = positions.head.toInt
    val endIndex = positions(1).toInt
    val str = readLine()
    println(str.slice(0, startIndex) + str.slice(startIndex, endIndex+1).reverse
      + str.slice(endIndex+1,str.length))
  }
}