package problems

/**
 * 350. Intersection of Two Arrays II
 *
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */

object p350 {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    def loop(n: Array[Int], m: Array[Int], acc: Array[Int]): Array[Int] = {
      (n, m) match {
        case (x, y) if x.isEmpty | y.isEmpty => acc
        case (x, y) if x.head == y.head => loop(x.tail, y.tail, acc :+ x.head)
        case (x, y) if x.head < y.head => loop(x.tail, y, acc)
        case (x, y) if x.head > y.head => loop(x, y.tail, acc)
      }
    }

    loop(nums1.sorted, nums2.sorted, Array[Int]())
  }
}
