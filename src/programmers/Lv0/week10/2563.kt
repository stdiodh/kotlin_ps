package programmers.Lv0.week10

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val square = Array(100){ Array(100) { false } }
    var result = 0

    repeat(n) {
        val x = nextInt(); val y = nextInt()
        for(i in x..< x + 10){
            for(j in y..< y + 10){
                if(square[i][j]){
                    continue
                }
                square[i][j] = true
                result++
            }
        }
    }
    println(result)
}