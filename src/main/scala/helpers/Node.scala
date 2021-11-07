package helpers

class Node(var _value: Int) {
  var value: Int = _value
  var left: Node = null
  var right: Node = null
  var next: Node = null

  override def toString: String = s"[(${if (value == null) "#" else value}), ${if (next == null) "#" else next}, $left, $right]"
}
