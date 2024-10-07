package programmers.Lv0.Beakjoon.Silver

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }
    val n = nextInt()
    val m = nextInt()

    fun primeNumberSieve() : IntArray {
        val nums = IntArray(1000001) { it }
        val ret = mutableListOf<Int>()

        for (x in 2 until nums.size) {
            if (nums[x] == 0) { continue }
            ret.add(nums[x])
            for (y in x + x until nums.size step x) {
                nums[y] = 0
            }
        }
        return ret.toIntArray()
    }

    val result = primeNumberSieve()
    result.filter { it in n .. m }.forEach{ println(it) }
}
