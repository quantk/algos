package main.codewars

//https://www.codewars.com/kata/550498447451fbbd7600041c/train/kotlin
fun comp(a: IntArray?, b: IntArray?): Boolean {
    if (a == null || b == null) {
        return false
    }

    a.sort()
    b.sort()

    for (i in a.indices) {
        if (b[i] != (a[i] * a[i])) {
            return false
        }
    }

    return true
}
