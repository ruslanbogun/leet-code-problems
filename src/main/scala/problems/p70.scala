package problems

/**
 * 70. Climbing Stairs
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

object p70 {
  object Solution {
    def climbStairs(n: Int): Int = {
      // Depth-first search
      // if (n < 0) 0 else if (n == 0) 1 else climbStairs(n - 1) + climbStairs(n - 2)

      // Dynamic Programming
      (1 to n).foldLeft((0, 1)) { case ((a, b), _) => (b, a + b) }._2
    }
  }
}
