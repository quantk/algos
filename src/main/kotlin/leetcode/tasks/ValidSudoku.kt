package main.leetcode.tasks

//https://leetcode.com/problems/valid-sudoku/
fun isValidSudoku(board: Array<CharArray>): Boolean {
    val tripleMap = mutableMapOf<String, MutableSet<Char>>()
    for (i in board.indices) {
        val columnsValidation = mutableSetOf<Char>()
        val rowsValidation = mutableSetOf<Char>()
        for (j in board[i].indices) {
            if (board[i][j] != '.' && !columnsValidation.add(board[i][j])) {
                return false
            }
            if (board[j][i] != '.' && !rowsValidation.add(board[j][i])) {
                return false
            }
            if (board[i][j] == '.') {
                continue
            }

            val pos: String = when (true) {
                i / 3 in 0..0 -> "0"
                i / 3 in 1..1 -> "1"
                else -> "2"
            } + when (true) {
                j / 3 in 0..0 -> "0"
                j / 3 in 1..1 -> "1"
                else -> "2"
            }

            if (tripleMap[pos] == null) {
                tripleMap[pos] = mutableSetOf()
            }
            if (tripleMap[pos]?.add(board[i][j]) == false) {
                return false
            }
        }
    }

    return true
}
