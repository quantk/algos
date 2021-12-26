package main.leetcode.tasks


//https://leetcode.com/problems/search-a-2d-matrix/
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    for (i in matrix.indices) {
        if (matrix[i][matrix[i].size - 1] < target) {
            continue
        } else {
            return matrix[i].binarySearch(target) >= 0
        }
    }

    return false
}
