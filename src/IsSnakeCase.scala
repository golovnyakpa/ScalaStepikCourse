import scala.io.StdIn.readLine

object IsSnakeCase {

  def containsCapital(str: String): Boolean = str.exists(_.isUpper)

  def startsWithUnderscore(str: String): Boolean = str.startsWith("_") || str.endsWith("_")

  def containsDoubleUnderscore(str: String): Boolean = {
    val pattern = "_{2,}".r
    val res = pattern.findFirstIn(str)
    res.nonEmpty
  }

  def containsOnlyLettersAndUnderscores(str: String): Boolean = {
    val pattern = "[^a-zA-Z_]".r
    val res = pattern.findFirstIn(str)
    res.nonEmpty
  }

  def main(args: Array[String]): Unit = {
    val input = readLine()
    println(!(containsCapital(input) || startsWithUnderscore(input) || containsDoubleUnderscore(input)
      || containsOnlyLettersAndUnderscores(input)))
  }
}
