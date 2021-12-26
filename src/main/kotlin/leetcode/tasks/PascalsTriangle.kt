package main.leetcode.tasks

//https://leetcode.com/problems/pascals-triangle/
fun pascalTriangle(numRows: Int): List<List<Int>> {
    val rows = mutableListOf<List<Int>>(mutableListOf(1))
    for (i in 1 until numRows) {
        val prevRow = rows[i - 1]
        val newRow = mutableListOf<Int>()
        var prev = 0
        for (digit in prevRow) {
            newRow.add(prev + digit)
            prev = digit
        }
        newRow.add(1)
        rows.add(newRow)
    }

    return rows
}
