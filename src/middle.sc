def middle[T](data: Iterable[T]): T = {
  val size = data.size
  val tuples: (Iterable[T], Iterable[T]) = data.splitAt(size / 2)
  tuples._2.head
}

require(middle("Scala") == 'a')
require(middle(Seq(1, 7, 5, 9)) == 5)
middle("scala")
middle(Seq(1,7,5,9))