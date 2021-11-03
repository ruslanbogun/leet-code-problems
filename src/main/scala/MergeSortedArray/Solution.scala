package MergeSortedArray

object Solution {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var f = m - 1
    var s = n - 1
    var i = nums1.length - 1
    while (f >= 0 && s >= 0) {
      if (nums1(f) > nums2(s)) {
        nums1(i) = nums1(f)
        f -= 1
      } else {
        nums1(i) = nums2(s)
        s -= 1
      }
      i -= 1
    }
    if (f < s) {
      for {i <- 0 to s} {
        nums1(i) = nums2(i)
      }
    }
  }
}

object Main extends App {
  val nums1 = Array[Int](1)
  val nums2 = Array[Int]()
  Solution.merge(nums1, 1, nums2, 0)
}
