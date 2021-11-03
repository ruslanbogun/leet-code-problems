package ReverseString

import org.scalatest._
import flatspec._
import matchers._

class ReverseStringSpec extends AnyFlatSpec with should.Matchers {
  "Reverse String" should "test 1" in {
    var s = "hello".toCharArray
    Solution.reverseString(s)
    s.mkString("") should be("olleh")
  }

}
