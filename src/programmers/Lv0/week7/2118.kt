package programmers.Lv0.week7

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val arr = IntArray(n) { nextInt() }
    val psum = IntArray(n+1) {0}
    for (i in 1 .. n) {
        psum[i] = psum[i - 1] + arr[i - 1]
    }

    var ans = 0
    var start = 1; var end = 1;
    while (start <= end && end < n + 1) {
        val right = psum[end] - psum[start - 1]
        val left = psum[n] - psum[end] + psum[start - 1]

        if (right < left) {
            ans = max(ans, right)
            end += 1
        } else {
            ans = max(ans, left)
            start += 1
        }
    }
    println(ans)
}

