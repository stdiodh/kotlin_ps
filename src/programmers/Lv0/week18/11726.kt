package programmers.Lv0.week18

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val dp = IntArray(1001) { 0 }

    dp[1] = 1
    dp[2] = 2

    for(x in 3..n){
        dp[x] = (dp[x-1] + dp[x-2]) % 10007
    }
    print(dp[n])
}

/*
1. 수열의 점화식 도출 -> n에 값에 따른 규칙을 찾는다. (최소 6까지 생각해보자) 즉 an = an-1 + an-2 (n>=3)
2. 도출했다면 조건을 만들고
 */