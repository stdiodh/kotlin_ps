package programmers.Lv0.week6

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val m = nextInt()
    val list = Array(n + 1){ IntArray (m + 1) { 0 }}
    repeat(n) { idx ->
        repeat(m) {jdx ->
            list[idx+1][jdx+1] = nextInt()
        }
    }

    repeat(nextInt()){
        val i = nextInt(); val j = nextInt(); val x = nextInt(); val y = nextInt()
        var sum = 0
        for (idx in i..x){
            for(jdx in j..y){
                sum += list[idx][jdx]
            }
        }
        println(sum)
    }
}


