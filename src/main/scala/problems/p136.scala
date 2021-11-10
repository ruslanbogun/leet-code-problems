package problems

object p136 {
  def singleNumber(nums: Array[Int]): Int = {
    nums.reduce(_^_)
  }
}
