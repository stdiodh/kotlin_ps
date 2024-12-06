package programmers.Lv0.week14

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt()
    val tree = IntArray(n) { nextInt() }

    var start = 0L; var end = tree.max().toLong()
    var ans = 0L
    while (start <= end) {
        val mid = (start + end) / 2
        var total = 0L
        for (t in tree){
            if (t > mid) {
                total += t - mid
            }
        }
        if( total >= m ){
            ans = max(ans, mid)
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    print(ans)
}