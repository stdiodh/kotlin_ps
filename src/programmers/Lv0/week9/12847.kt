package programmers.Lv0.week9

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int{
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val m = nextInt()

    val arr = LongArray(n){
        nextInt().toLong()
    }

    var sum = 0L
    repeat(m){
        sum += arr[it]
    }

    var ans = sum
    for(x in m..<n){
        sum+=arr[x] - arr[x-m]
        ans = max(ans, sum)
    }
    println(ans)
}