import scala.io.StdIn.readInt


object Main {
  def main(args: Array[String]) {
    // your code here
    val n = readInt()
    for (i <- 1 until n; j <- 1 until n) {
      if (BigInt(i).gcd(BigInt(j)) == 1)
        println(i + " " + j)
    }
  }
}