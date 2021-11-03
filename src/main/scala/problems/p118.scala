package problems

object p118 {
  def generate(numRows: Int): List[List[Int]] = {
    (1 to numRows).foldLeft(List.empty[List[Int]]) {
      case (Nil, _) => List(List(1))
      case (l, _) =>
        def loop(t: List[Int], acc: List[Int]): List[Int] = {
          t match {
            case Nil => acc
            case _ :: Nil => acc
            case h :: t => loop(t, acc :+ h + t.head)
          }
        }

        l :+ (l.last.head +: loop(l.last, List.empty[Int]) :+ l.last.last)
    }
  }
}
