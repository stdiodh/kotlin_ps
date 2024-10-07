package programmers.Lv0.week5

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }
    val nums = mutableListOf<Int>()
    var result = 0
    val input = nextInt()
    repeat(input){
        nums.add(nextInt())
    }

    fun isPrime(x: Int): Boolean{
        if(x <= 1) return false
        for(i in 2 .. Math.sqrt(x.toDouble()).toInt()){
            if (x % i == 0) return false
        }
        return true
    }

    for(x in nums){
        if(isPrime(x)) result += 1
    }

    println(result)
}