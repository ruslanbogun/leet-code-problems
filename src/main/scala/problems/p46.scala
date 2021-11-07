package problems

object p46 {
  def permute(nums: Array[Int]): List[List[Int]] = {
    def loop(n: Array[Int]): List[List[Int]] = {
      if (n.isEmpty) Nil else {
        (for {
          a <- 0 to n.length
        } yield {
          println(a)
          loop((n diff Array(a)).tail).flatMap(n.head +: _)
        }).toList
      }
    }

    loop(nums)
  }
}
