package problems

object p191 {
  def hammingWeight(n: Int): Int = {
    def loop(num: Int, acc: Int): Int = {
      if (num <= 0) acc else loop(num << 1, acc + num % 2)
    }

    loop(n, 0)
  }
}
