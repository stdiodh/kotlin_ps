package programmers.Lv0.week17

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); var m = nextInt()
    val money = IntArray(n){ nextInt() }.sortedArrayDescending()
    var ans = 0

    for(x in money) {
        ans += m / x
        m %= x
    }
    print(ans)
}