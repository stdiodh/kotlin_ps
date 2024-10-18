package programmers.Lv0.week6

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val psum = IntArray(n+1) {0}
    val arr = IntArray(n) {
        nextInt()
    }

    for (i in 1 .. n) {
        psum[i] = psum[i - 1] + arr[i - 1]
    }

    var ans = 0
    for (i in 2 ..< n) {
        ans = max(ans, 2 * psum[n] - psum[1] - psum[i] - arr[i - 1])
    }

    for (i in 2 ..< n) {
        ans = max(ans, psum[n - 1] + psum[i - 1] - arr[i - 1])
    }

    for (i in 2 ..< n) {
        ans = max(ans, psum[i] - psum[1] + psum[n - 1] - psum[i - 1])
    }

    println(ans)
}