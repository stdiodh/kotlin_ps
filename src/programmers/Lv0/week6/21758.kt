package programmers.Lv0.week6

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val pSum = IntArray(n+1) {0}
    //꿀통의 배열
    val arr = IntArray(n) {
        nextInt()
    }

    //꿀통의 누적합
    for (i in 1 .. n) {
        pSum[i] = pSum[i - 1] + arr[i - 1]
    }


    var ans = 0
    //벌통이 중앙에 있는 경우
    for (i in 2 ..< n) {
        ans = max(ans, 2 * pSum[n] - pSum[1] - pSum[i] - arr[i - 1])
    }

    //벌통이 가장 왼쪽에 있는 경우
    for (i in 2 ..< n) {
        ans = max(ans, pSum[n - 1] + pSum[i - 1] - arr[i - 1])
    }

    //벌통이 가장 오른쪽에 있는 경우
    for (i in 2 ..< n) {
        ans = max(ans, pSum[i] - pSum[1] + pSum[n - 1] - pSum[i - 1])
    }

    println(ans)
}