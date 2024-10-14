package programmers.Lv0.week6
/*
import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val m = nextInt()
    val pSum = Array(n+1){
        IntArray(n+1) { 0 }
    }
    repeat(n){i ->
        repeat(n){j ->
            pSum[i + 1][j + 1] = pSum[i][j + 1] + pSum[i + 1][j] - pSum[i][j] + nextInt()
        }
    }
    val sb = StringBuilder()

    repeat(m){
        val x1 = nextInt(); val y1 = nextInt(); val x2 = nextInt(); val y2 = nextInt()
        sb.appendLine(pSum[x2][y2] - pSum[x2][y1 - 1] - pSum[x1 - 1][y2] + pSum[x1- 1][y1 - 1])
    }
    print(sb)
}
 */