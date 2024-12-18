package programmers.Lv0.week15

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()

    var cnt = 0
    var i = 0
    while (cnt < n) {
        i += 1
        if (threeSix(i)) cnt += 1
    }
    print(i)
}

fun threeSix(n: Int): Boolean {
    var num = n
    var cnt = 0
    while (num > 0) {
        if (num%10 == 6) {
            cnt += 1
            if (cnt==3) return true
        } else cnt = 0
        num /= 10
    }
    return false
}