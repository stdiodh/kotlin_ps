package programmers.Lv0.week18

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt(): Int { nextToken(); return nval.toInt() }

    //수 범위의 배열을 만든다.
    val dp = Array(31){ IntArray(31) }

    //n의 공간이 하나라면 m이 몇 개가 있든 m을 따라가기에 dp 테이블 설정
    for(i in 1 .. 30){
        dp[1][i] = i
    }

    //1일 때의 dp 테이블을 설정해놨으니 2부터 시작해 수의 범위인 30까지 dp 테이블을 만든다.
    for(x in 2..30){
        for(y in 2..30){
            //x가 y보다 커진다는 경우가 없기에 넘어가준다.
            if(x > y){
                continue
            }
            //x와 y가 같으면 그 경우의 수는 1개이다.
            //아니라면 dp[x][y]는 각각 (1,1)위와 (0,1)위 배열을 합한 값이다.
            if(x == y){
                dp[x][y] = 1
            } else {
                dp[x][y] = dp[x-1][y-1] + dp[x][y-1]
            }
        }
    }

    //dp[n][m]에 해당하는 값을 출력해준다.
    val sb = StringBuilder()
    repeat(nextInt()){
        val n = nextInt(); val m = nextInt()
        sb.appendLine(dp[n][m])
    }
    print(sb)
}