package programmers.Lv0.week10

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val x = nextInt()
    var top = 0
    var bottom = 0

    //열의 순번
    var tmp = 0
    //분자 분모의 합
    var sum = 1

    while(tmp < x){
        tmp += sum
        sum++
    }

    if(sum % 2 == 0){
        top = tmp - x + 1
        bottom = sum - top
    } else {
        bottom = tmp - x + 1
        top = sum - bottom
    }

    println("$top/$bottom")
}