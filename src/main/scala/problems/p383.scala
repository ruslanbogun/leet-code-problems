package problems

object p383 {
  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val ransomNoteGroup = ransomNote.groupBy(identity)
    val magazineGroup = magazine.groupBy(identity)
    ransomNote.foldLeft(true) { case (acc, c) =>
      acc & !(!magazineGroup.contains(c) || magazineGroup(c).length < ransomNoteGroup(c).length)
    }
  }
}
