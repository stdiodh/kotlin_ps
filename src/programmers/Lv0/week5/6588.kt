package programmers.Lv0.week5

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    fun primeNumberSieve(): IntArray {
        val nums = IntArray(1000001) { it }
        val ret = mutableListOf<Int>()

        for (x in 2 until nums.size) {
            if (nums[x] == 0) {
                continue
            }
            ret.add(nums[x])
            for (y in x + x until nums.size step x) {
                nums[y] = 0
            }
        }
        return ret.toIntArray()
    }

    val primeArray = primeNumberSieve()

    while (true) {
        val num = nextInt()
        var flag = 0
        if (num == 0) {
            break
        }

        for (x in primeArray.indices) {
            if(flag == 1) {
                break
            }
            for (y in primeArray.indices) {
                if (primeArray[x] + primeArray[y] == num) {
                    println("$num = ${primeArray[x]} + ${primeArray[y]}")
                    flag = 1
                    break
                }
            }
        }
        if (flag == 0) {
            println("Goldbach's conjecture is wrong.")
        }
    }
}