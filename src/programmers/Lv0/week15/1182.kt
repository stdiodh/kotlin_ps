package programmers.Lv0.week15

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val s = nextInt()
    val arr = IntArray(n) { nextInt() }

    var cnt = 0

    //공집합을 포함하지 않는 부분수열만 포함하므로 S==0일 때 공집합을 제외하기 위해 cnt - 1
    if(s == 0) {
        cnt--
    }

    fun dfs(x : Int, value : Int) {
        if(x == n) {
            if (value == s) cnt++
        } else {
            //해당 값을 포함하는 모든 부분수열
            dfs(x+1, value)
            //해당 값을 포함하지 않는 모든 부분수열
            dfs(x+1, value + arr[x])
        }
    }

    //x는 배열 몇 개를 가져오는지 value는 x개를 가져왔을 때의 총합
    dfs(0, 0)
    print(cnt)
}
