package programmers.Lv0.week18

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    //1. 입력받기
    val n = nextInt()
    val arr = Array(n) { nextInt() }

    //2. dp 테이블 생성
    val dp = Array(n) { 0 }
    dp[0] = arr[0]
    var max = arr[0]

    //3. 1번째 배열부터 순회를 돌며 이전 dp 테이블과 현재 배열의 합이 전 배열보다 큰지 확인하고
    //3-1. 그 수가 크다면 max 값에 대입
    for(i in 1 ..< n){
        dp[i] = max(dp[i-1] + arr[i], arr[i])
        max = max(max, dp[i])
    }
    print(max)
}