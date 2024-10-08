package programmers.Lv0.week5

import kotlin.math.sqrt

fun main() {
    fun check(n: Long): Boolean {
        val sqrt = sqrt(n.toDouble()).toLong() + 1
        for (i in 2..sqrt) {
            if (n % i == 0L) return false
        }
        return true
    }


    repeat(readln().toInt()){
        var num = readln().toLong()
        while (true) {
            if(num <= 2){
                println(2)
                break
            }
            else if (check(num)) {
                println(num)
                break
            } else {
                num++
            }
        }
    }
}
