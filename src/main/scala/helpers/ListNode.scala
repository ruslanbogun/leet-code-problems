package helpers


class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x

  override def toString: String = s"($x, $next)"

  override def equals(obj: Any): Boolean = obj.asInstanceOf[ListNode].x == x && obj.asInstanceOf[ListNode].next == next
}
