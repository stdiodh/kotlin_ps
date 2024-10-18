package programmers.Lv0.week7

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    //배열에서 i부터 j까지의 합을 구해서 M이 되는 경우
    //크기가 N짜리 배열이 들어옴

    val n = nextInt(); val m = nextInt()
//    val arr = IntArray(n){ nextInt() }

    //1. 누적합을 구한다.
    var pSum = IntArray(n+1) { 0 }
    repeat(n){idx ->
        pSum[idx + 1] = pSum[idx] + nextInt()
    }

    var ans = 0
    //투포인터 고정 0으로
    var start = 0; var end = 0

    //while 조건은 고정
    while (start <= end && end < n + 1){
        //2. 누적합에서 투 포인터로 배열을 순회한다.
        val sum = pSum[end] - pSum[start]
        //2-1. 합이 M이랑 같으면 =1
        if(sum == m) { ans += 1 }
        //2-2. 합이 작으면 end +1
        if(sum < m) { end += 1 }
        //2-3. 합이 크거나 같으면 start+1
        else{ start += 1 }
    }
    println(ans)
}