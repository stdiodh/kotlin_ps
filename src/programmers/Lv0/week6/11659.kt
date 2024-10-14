package programmers.Lv0.week6
/*
import java.io.StreamTokenizer


fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val m = nextInt()
    val prifixSum = IntArray(n+1) { 0 }

    repeat(n){ idx ->
        prifixSum[idx + 1] = nextInt() + prifixSum[idx]

        val sb = StringBuilder()
        repeat(m){
            val x = nextInt(); val y = nextInt()
            sb.appendLine(prifixSum[y] - prifixSum[x - 1])
        }
        print(sb)
    }
}
 */