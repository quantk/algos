package main.leetcode.tasks

//https://leetcode.com/problems/reshape-the-matrix/
fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    if (r * c != (mat.size * mat[0].size)) {
        return mat
    }
    val flatMatrix = mutableListOf<Int>()
    for (i in mat.indices) {
        for (j in mat[i].indices) {
            flatMatrix.add(mat[i][j])
        }
    }

    val result = Array(r) {IntArray(c) {0} }
    var counter = 0

    for (i in 0 until r) {
        for (j in 0 until c) {
            result[i][j] = flatMatrix[counter]
            counter++
        }
    }

    return result
}
