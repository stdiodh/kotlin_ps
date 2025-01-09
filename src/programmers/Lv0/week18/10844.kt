package programmers.Lv0.week18

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val div = 1_000_000_000

    //n이 1~100까지 길이 별로 0부터 9까지 존재
    val dp = Array(101) { IntArray(10) { 0 } }

    //1자리 수 일때는 경우의 수가 1가지 임
    for(i in 1..9){
        dp[1][i] = 1
    }


    for(x in 2 .. n){
        //0이 마지막인 경우는 직전 값이 1인 경우 밖에 없음
        dp[x][0] = dp[x-1][1] % div
        //9가 마지막인 경우 직전 값이 8인 경우 밖에 없음
        dp[x][9] = dp[x-1][8] % div

        //나머지 1부터 8까지의 수가 들어왔을 때의 경우의 수
        for(y in 1..8){
            dp[x][y] += (dp[x-1][y-1] + dp[x-1][y+1]) % div
        }
    }

    //경우의 수를 더해서 div 로 나눠줌
    var ans = 0
    for(i in 0..9){
        ans = (ans + dp[n][i]) % div
    }

    print(ans)
}