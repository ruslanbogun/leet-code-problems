package problems

object p169 {
  def majorityElement(nums: Array[Int]): Int = {
    nums.sorted.groupBy(identity).maxBy(_._2.length)._1
  }
}
