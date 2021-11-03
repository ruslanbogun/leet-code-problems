package problems

/**
 * 121. Best Time to Buy and Sell Stock
 */
object p121 {
  /**
   * Brute Force
   *
   * @param prices
   * @return
   */
  def _maxProfit(prices: Array[Int]): Int = {
    def loop(p: Array[Int], m: Int): Int = {
      p match {
        case x if p.tail.isEmpty => m
        case x => loop(x.tail, Math.max(x.tail.sorted.last - x.head, m))
      }
    }

    loop(prices, 0)
  }

  /**
   * One Pass
   *
   * @param prices
   * @return
   */
  def maxProfit(prices: Array[Int]): Int = {
    prices.foldLeft((Int.MaxValue, 0)) { case ((min, profit), prise) =>
      (Math.min(min, prise), Math.max(profit, prise - min))
    }._2
  }

}
