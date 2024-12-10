package programmers.Lv0.week14

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val x = nextInt(); val y = nextInt()
    val z : Long = (100L * y) / x

    if (z >= 99) {
        println("-1")
        return
    }
    var start = 0; var end = 1000000000

    while (start < end) {
        val mid = (start + end) / 2
        val winPerc = ((mid + y) * 100L) / (x + mid)

        if (winPerc > z) {
            end = mid
        } else {
            start = mid + 1
        }
    }

    println(end)
}