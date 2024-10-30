package programmers.Lv0.week8

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val x = nextInt()

    val pSum = IntArray(n+1){ 0 }
    repeat(n){
        pSum[it+1] = pSum[it] + nextInt()
    }

    //비교할 x일 동안 가장 많이 들어온 방문자 수
    var totalSum = pSum[x]
    var maxCnt = 0

    for (i in x .. n) {
        val sum = pSum[i] - pSum[i-x]
        if (totalSum < sum){
            totalSum = sum
            maxCnt = 1
        } else if (totalSum == sum) {
            maxCnt++
        }
    }

    if (totalSum == 0) {
        println("SAD")
    } else {
        println(totalSum)
        println(maxCnt)
    }
}