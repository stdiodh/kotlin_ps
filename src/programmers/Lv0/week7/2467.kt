package programmers.Lv0.week7

import java.io.StreamTokenizer
import kotlin.math.abs

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val arr = IntArray(n) { nextInt() }.sortedArray()
    var l = 0;
    var r = n - 1;
    var value = arr[l] + arr[r]
    var result = listOf(l, r)
    while (l != r) {
        var total = arr[l] + arr[r]
        if (abs(total) < abs(value)) {
            value = total
            result = listOf(l, r)
        }

        if (total < 0) {
            l += 1
        } else {
            r -= 1
        }
    }
    println("${arr[result[0]]}, ${arr[result[1]]}")
}