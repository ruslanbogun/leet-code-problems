package problems

object p77 {
  def combine(n: Int, k: Int): List[List[Int]] = {
    def loop(list: List[Int], deep: Int): List[List[Int]] = {
      if (deep == 0) List(Nil) else {
        if (list.isEmpty) List() else {
          loop(list.tail, deep) ++ loop(list.tail, deep - 1).map(list.head :: _)
        }
      }
    }

    loop((1 to n).toList, k)
  }
}
