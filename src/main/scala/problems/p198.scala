package problems

object p198 {
  def rob(nums: Array[Int]): Int = {
    /**
     * 2 7 9 3                                             (maxAmount  maxAmount prevAmount + number) -> (prevAmount, maxAmount)
     * step 1 prevAmount = 0 maxAmount=0  number=2         (0,               0  < 0+2)
     * step 2 prevAmount = 0 maxAmount=2  number=7         (2,               2  < 0+7)
     * step 3 prevAmount = 2 maxAmount=7  number=9         (7,               7  < 2+9)
     * step 4 prevAmount = 7 maxAmount=11 number=          (3,               11 > 7+3)
     *
     * (prevAmount = 3 maxAmount=11)
     */

    nums.foldLeft((0, 0)) { case ((prevAmount, maxAmount), number) => (maxAmount, Math.max(maxAmount, prevAmount + number)) }._2
  }
}
