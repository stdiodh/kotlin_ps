package programmers.Lv0.week5

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    fun primeNum(n: Int): Boolean {
        for (x in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % x == 0) {
                return false
            }
        }
        return true
    }

    while(true){
        val num = nextInt()
        var result = 0
        if (num == 0) {
            break
        }

        for(x in num+1..num*2){
            if(primeNum(x)){
                result += 1
            }
        }
        println(result)
    }
}