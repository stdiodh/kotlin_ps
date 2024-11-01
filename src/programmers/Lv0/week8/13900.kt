package programmers.Lv0.week8

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int{
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()

    val arr = IntArray(n){
        nextInt()
    }

    val pSum = LongArray(n+1){
        0
    }

    repeat(n){
        pSum[it+1] = pSum[it] + arr[it]
    }

    var result = 0L
    for(x in 0 until n){
        result += arr[x] * (pSum[n] - pSum[x+1]);
    }
    println(result)
}