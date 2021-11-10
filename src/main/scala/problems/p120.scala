package problems

object p120 {
  def minimumTotal(triangle: List[List[Int]]): Int = {
    val EMPTY_LIST = List.empty[Int]
    val ZERO_LIST = List.fill(triangle.length + 1)(0)

    triangle.reverse.foldLeft(ZERO_LIST) { case (sumList, curList) =>
      sumList.tail.foldLeft((curList, EMPTY_LIST, sumList.head)) { case ((arr, acc, right), left) =>
        (arr.tail, acc :+ (arr.head + Math.min(right, left)), left)
      }._2
    }.head
  }
}
