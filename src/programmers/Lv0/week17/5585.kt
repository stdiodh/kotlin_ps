package programmers.Lv0.week17

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    var n = 1000 - nextInt()
    val money = intArrayOf(500, 100, 50, 10, 5, 1)

    var ans = 0
    // 지폐를 내림차순으로 순회하면서
    // 그리디 알고리즘의 핵심은 문제에서 주어진 배열의 정렬해 준 것이 중요하다.
    for (m in money){
        // 지폐로 전체 돈을 나눈 몫은 정답에 더하고
        ans += n / m
        // 나머지는 n에 할당해서 다음 연산을 수행
        n %= m
    }

    print(ans)
}