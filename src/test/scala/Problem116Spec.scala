import helpers.Node
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import problems.p116.connect

class Problem116Spec extends AnyFunSpec with Matchers {
  describe("Populating Next Right Pointers in Each Node") {
    val root = new Node(1)
    root.left = new Node(2)
    root.left.left = new Node(4)
    root.left.right = new Node(5)
    root.right = new Node(3)
    root.right.left = new Node(6)
    root.right.right = new Node(7)

    println(connect(root).toString)

    //should be("[(1), #, [(2), [(3), #, [(6), [(7), #, null, null], null, null], [(7), #, null, null]], [(4), [(5), [(6), [(7), #, null, null], null, null], null, null], null, null], [(5), [(6), [(7), #, null, null], null, null], null, null]], [(3), #, [(6), [(7), #, null, null], null, null], [(7), #, null, null]]]")
  }
}
