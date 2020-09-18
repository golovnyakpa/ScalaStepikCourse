import scala.annotation.tailrec

class Point(val x: Double,val y: Double,val  z: Double) {
  override def toString: String = s"$x $y $z"
}

object Point {
  def apply(x: Double, y: Double, z: Double): Point = new Point(x, y, z)

  def average(xs: List[Point]): Point = {
    @tailrec
    def inner(points: List[Point], accum1: Double, accum2: Double, accum3: Double): (Double, Double, Double) = {
      points match {
        case point :: tail => inner(tail, accum1 + point.x, accum2 + point.y, accum3 + point.z)
        case Nil => (accum1, accum2, accum3)
      }
    }
    xs.length match {
      case 0 => new Point(0, 0, 0)
      case _ => {
        val res = inner(xs, 0, 0, 0)
        new Point(res._1 / xs.length, res._2 / xs.length, res._3 / xs.length) // TODO как развернуть тапл в конструктор класса
      }
    }
  }

  def show(point: Point): String = s"${point.x} ${point.y} ${point.z}"

  def main(args: Array[String]): Unit = {
    val p1 = new Point(1,2.5,4)
    val p2 = new Point(4,3.5,6)
    println(Point.average(List(p1, p2)))
  }
}