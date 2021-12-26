package main.leetcode.tasks

import java.util.*

//https://leetcode.com/problems/sort-characters-by-frequency/
fun frequencySort(s: String): String {
    val map: MutableMap<Char, Int> = HashMap()
    for (i in s.indices) {
        val c: Char = s[i]
        map[c] = map.getOrDefault(c, 0) + 1
    }

    val pq = PriorityQueue { c1: Char, c2: Char ->
        map[c2]!! - map[c1]!!
    }
    for ((k,`val`) in map) {
        pq.add(k)
    }

    val sb = StringBuilder()
    while (!pq.isEmpty()) {
        val c = pq.poll()
        for (i in 0 until map[c]!!) {
            sb.append(c)
        }
    }

    return sb.toString()
}
