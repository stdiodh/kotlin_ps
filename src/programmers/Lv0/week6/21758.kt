package programmers.Lv0.week6

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    //1. 입력을 받는다.
    val n = nextInt()
    val pSum = IntArray(n+1) {0}
    //꿀통의 배열
    val arr = IntArray(n) {
        nextInt()
    }
    //꿀 배열의 누접합을 구해서 연산을 수행
    for (i in 1 .. n) {
        pSum[i] = pSum[i - 1] + arr[i]
    }


    //2. 벌이 꿀을 채취할 수 있는 경우의 수를 순회
    var ans = 0
    //2-1. 벌통이 오른쪽 끝에 있는 경우
    for (i in 2 ..< n) {
        //arr은 자기 자신의 위치를 채취하지 못함
        val left = pSum[n] - pSum[1] - arr[i - 1]
        val right = pSum[n] - pSum[i]
        val total = left + right
        ans = max(ans, total)
    }

    //2-2. 벌통이 왼쪽 끝에 있는 경우
    for (i in 2 ..< n) {
        val right = pSum[n - 1] - arr[i - 1]
        val left = pSum[i]
        val total = right + left
        ans = max(ans, total)
    }

    //2-3. 벌통이 가운데 있을 때 경우에서 최대값.
    for (i in 2 ..< n) {
        //pSum[i - 1]은 벌통의 위치
        val total = pSum[i] - pSum[1] + pSum[n - 1] - pSum[i - 1]
        ans = max(ans, total)
    }

    println(ans)
}