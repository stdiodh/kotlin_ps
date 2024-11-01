package programmers.Lv0.week6

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val r = nextInt(); val c = nextInt(); val q = nextInt();

    val pSum = Array(r+1) { IntArray (c+1) { 0 } }

    repeat(r){idx ->
        repeat(c) {jdx ->
            pSum[idx+1][jdx+1] = pSum[idx + 1][jdx] + pSum[idx][jdx + 1] - pSum[idx][jdx] + nextInt()
        }
    }

    val sb = StringBuilder()
    repeat(q){
        val r1 = nextInt()
        val c1 = nextInt()
        val r2 = nextInt()
        val c2 = nextInt()

        var count = 0
        //직사각형 넓이 구하는 공식
        val sq = (r2-r1+1) * (c2-c1+1)

        sb.appendLine((pSum[r2][c2] - pSum[r2][c1-1] - pSum[r1-1][c2] + pSum[r1-1][c1-1]) / sq)
    }
    println(sb)
}