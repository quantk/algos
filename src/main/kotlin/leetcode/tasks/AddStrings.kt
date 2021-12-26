package main.leetcode.tasks

//https://leetcode.com/problems/add-strings/
fun addStrings(num1: String, num2: String): String {
    var longest = num1
    var shortest = num2

    if (num2.length > num1.length) {
        longest = num2
        shortest = num1
    }

    shortest = shortest.padStart(longest.length, '0')

    var carry = 0
    val result = StringBuilder()
    for (i in (longest.length - 1) downTo 0) {
        val curSum = longest[i].getDigit() + shortest[i].getDigit() + carry
        carry = if (curSum > 9) {
            result.append(curSum % 10)
            1
        } else {
            result.append(curSum)
            0
        }
    }

    if (carry > 0) {
        result.append(1)
    }

    return result.toString().reversed()
}
