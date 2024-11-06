package programmers.Lv0.week9

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val k = nextInt()
    val arr = LongArray(n){nextInt().toLong()}

    var sum = 0L
    repeat(k){
        sum += arr[it]
    }

    var ans = sum
    for(x in k..<n){
        sum += arr[x] - arr[x-k]
        ans = max(ans, sum)
    }
    println(ans)
}