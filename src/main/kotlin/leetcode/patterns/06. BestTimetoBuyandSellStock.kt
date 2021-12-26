package main.leetcode.patterns

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = Int.MIN_VALUE

    for (price in prices) {
        minPrice = minOf(minPrice, price)
        maxProfit = maxOf(maxProfit, price - minPrice)
    }

    return maxProfit
}
