package main.leetcode.tasks

//https://leetcode.com/problems/first-bad-version/
/* The isBadVersion API is defined in the parent class VersionControl.
      def isBadVersion(version: Int): Boolean = {} */
open class VersionControl {
    fun isBadVersion(version: Int): Boolean = version >= 1702766719
}

class Solution: VersionControl() {
    fun firstBadVersion(n: Int) : Int {
        var left = 0L
        var right = n.toLong()

        while (right - left > 1) {
            val middle: Long = ((left + right) / 2).toLong()
            if (this.isBadVersion(middle.toInt())) {
                right = middle
            } else {
                left = middle
            }
        }

        return right.toInt()
    }
}
