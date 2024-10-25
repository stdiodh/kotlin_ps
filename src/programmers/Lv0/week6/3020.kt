package programmers.Lv0.week6

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    //장애물판 길이 n 높이가 h
    val n = nextInt(); val h = nextInt()
    //line 장애물의 누적합
    val line = IntArray(h) {0}
    repeat(n) { idx ->
        //장애물 사이즈
        val size = nextInt()
        //2로 나눠지는 것은 종류석 아니면 석순
        if (idx % 2 == 0) {
            line[h - size] += 1
        } else {
            line[0] += 1
            line[size] -= 1
        }
    }

    //장해물의 누적합
    for (i in 1 ..< h) {
        line[i] += line[i - 1]
    }

    //가장 작은 충돌 횟수, 그 구간횟수를 출력
    val ans = line.min(); var cnt = 0
    line.forEach { l ->
        if (l == ans) { cnt += 1 }
    }
    println("$ans $cnt")
}