package main.codewars

//https://www.codewars.com/kata/556deca17c58da83c00002db/train/kotlin
fun tribonacci(signature: DoubleArray, n: Int) = DoubleArray(n)
    .also {
        for (i in 0 until n) {
            it[i] = if (i < signature.size) signature[i] else it[i - 3] + it[i - 2] + it[i - 1]
        }
    }
