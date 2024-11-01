package programmers.Lv0.week8

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val d = nextInt()
    val k = nextInt()
    val c = nextInt()

    val arr = IntArray(n) { nextInt() }
    val visit = IntArray(d + 1)
    var ans = Int.MIN_VALUE
    var cnt = 0

    // 첫 번째 초밥부터 연속 접시 수만큼 세어줌
    for (i in 0 until k) {
        if (visit[arr[i]] == 0) cnt++
        visit[arr[i]]++
    }

    // 최대 초밥 종류 수를 계산
    ans = if (visit[c] == 0) cnt + 1 else cnt

    // 영역을 옆으로 한 칸씩 밀어가면서 초밥의 종류 수를 업데이트
    for (i in 0 until n) {
        if (ans <= cnt) {
            ans = if (visit[c] == 0) cnt + 1 else cnt
        }

        // 맨 왼쪽 초밥을 제외
        visit[arr[i]]--
        if (visit[arr[i]] == 0) cnt--

        // 새로운 초밥을 추가
        val nextSushi = arr[(i + k) % n]
        if (visit[nextSushi] == 0) cnt++
        visit[nextSushi]++
    }

    println(ans)
}