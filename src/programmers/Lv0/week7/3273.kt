package programmers.Lv0.week7

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val arr = IntArray(n){
        nextInt()
    }
    arr.sort()

    val x = nextInt()
    var left = 0; var right = arr.size - 1
    var ans = 0

    while (left < right){
        val sum = arr[left] + arr[right]
        if(sum == x) { ans += 1 }
        if(sum < x) { left += 1 }
        else{ right -= 1 }
    }
    println(ans)
}