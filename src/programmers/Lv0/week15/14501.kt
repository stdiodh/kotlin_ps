package programmers.Lv0.week15

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    val n = nextInt() // 남은 근무일
    // 작업 배열 초기화
    val arr = Array<Pair<Int, Int>>(n) { Pair(nextInt(), nextInt()) }
    // 정답 변수
    var ans = 0
    // 재귀함수를 통해 모든 경우의 수를 계산
    fun dfs(p : Int, day : Int) {
        // 현재 날짜가 이미 예정 퇴사일을 넘었다면
        // 더 이상 작업을 하지 않고, 현재까지 보수를 저장
        if (day >= n) {
            // 기존에 있던 보수와 현재까지의 보수 중
            // 최대값을 저장
            ans = max(ans, p)
            return
        }
        // 오늘 시작할 상담
        val job = arr[day]
        // 상담 종료일이 남은 근무일수보다 적다면
        // 상담 보수와 현재 날짜를 갱신한 후 다시 재귀함수 실행
        if (job.first <= n - day) {
            dfs(p + job.second, day + job.first)
        }
        // 오늘 작업을 생략한 후 다음 날짜의 재귀함수 실행
        dfs(p, day + 1)
    }
    // 초기 보수는 0, 현재 날짜는 0일 = 인덱스와 동일하게 배정
    dfs(0, 0)
    // 재귀함수 종료 후 정답 호출
    print(ans)
}