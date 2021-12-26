package main.codewars

//https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/train/kotlin
fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    var iterContent = content
    val final = (content / 100) * threshold
    var counter = 0

    while (iterContent > final) {
        iterContent -= (iterContent / 100) * evap_per_day
        counter++
    }

    return counter
}
