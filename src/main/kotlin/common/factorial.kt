package main.common


tailrec fun factWithTailCall(n: Int, acc: Long = 1L): Long {
    if (n == 0) {
        return acc
    }

    return factWithTailCall(n - 1, acc * n)
}

fun fact(n: Int): Long {
    if (n == 0) {
        return 1
    }

    return n * fact(n - 1)
}
