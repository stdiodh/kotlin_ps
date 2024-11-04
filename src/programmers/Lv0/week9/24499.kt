package programmers.Lv0.week9

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val k = nextInt()
    val arr = IntArray(n) { nextInt() }
    var sum = 0
    repeat(k) {
        sum += arr[it]
    }

    var ans = sum
    for (i in 1 ..< n) {
        sum += arr[(i + k - 1) % n] - arr[i - 1]
        ans = max(ans, sum)
    }
    println(ans)
}