package main.leetcode.tasks

//https://leetcode.com/problems/multiply-strings/
fun multiply(num1: String, num2: String): String {
    if (num1 == "0" || num2 == "0") {
        return "0"
    }

    var longest = num1
    var shortest = num2

    if (num2.length > num1.length) {
        longest = num2
        shortest = num1
    }

    var result = "0"

    for ((addZeros, i) in (longest.length - 1 downTo 0).withIndex()) {
        val mulTarget = longest[i].getDigit()
        var carry = 0
        val currentString = StringBuilder()

        for (j in shortest.length - 1 downTo 0) {
            val multiplier = shortest[j].getDigit()
            val curResult = mulTarget * multiplier + carry
            currentString.append(curResult % 10)
            carry = curResult / 10
        }
        if (carry > 0) {
            currentString.append(carry)
        }
        currentString.toString().reversed().also {
            result = addStrings(result, it.padEnd(it.length + addZeros, '0'))
        }
    }

    return result
}

fun Char.getDigit() = Character.getNumericValue(this)
