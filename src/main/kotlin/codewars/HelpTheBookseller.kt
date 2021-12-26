package main.codewars

//https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/kotlin
fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
    if (lstOfArt.isEmpty()) {
        return ""
    }

    val result: Map<Char, Int> = lstOfArt
        .fold(mutableMapOf()) { acc, item ->
            acc[item[0]] = (acc[item[0]] ?: 0) + (item.filter { it.isDigit() }).toInt()
            acc
        }

    return lstOfCat.joinToString(" - ") { cat ->
        "($cat : ${result[cat.single()] ?: 0})"
    }
}
