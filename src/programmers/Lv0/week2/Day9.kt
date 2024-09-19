package programmers.Lv0.week2

/* 마지막 두 원소
class Solution {
    fun solution(num_list: IntArray): IntArray {
        val answer = num_list.takeLast(2)
        var list = num_list
        list += if(answer[0] < answer[1]){
            (answer[1] - answer[0])
        } else {
            (answer[1] * 2)
        }
        return list
    }
}

class Solution {
    fun solution(num_list: IntArray): IntArray {
        val answer = num_list.toMutableList().apply {
            val (first, second) = num_list.takeLast(2)
            if (first < second) add(second - first)
            else add(second + second)
        }
        return answer.toIntArray()
    }
}
 */

/*이어 붙인 수
class Solution {
    fun solution(num_list: IntArray): Int {
        var even = ""
        var odd = ""
        for (x in num_list.indices) {
            if(num_list[x] % 2 == 0){
                even += num_list[x]
            } else {
                odd += num_list[x]
            }
        }
        return even.toInt() + odd.toInt()
    }
}

class Solution {
    fun solution(num_list: IntArray): Int {
        val odd = num_list.filter { it % 2 == 1 }.joinToString("").toInt()
        val even = num_list.filter { it % 2 == 0 }.joinToString("").toInt()

        return odd + even
    }
}
 */

/* 원소들의 곱과 합
import kotlin.math.pow

class Solution {
    fun solution(num_list: IntArray): Int {
        val add = num_list.sum().toDouble().pow(2)
        var multi = 1

        for(x in num_list.indices){
            multi *= num_list[x]
        }

        if (add.toInt() > multi) {
            return 1
        } else {
            return 0
        }
    }
}

class Solution {
    fun solution(num_list: IntArray): Int {
        val sum = num_list.sum().let { it * it }
        val multiply = num_list.reduce { acc, n -> acc * n }
        return if (multiply < sum) 1 else 0
    }
}

 */

/*
class Solution {
    fun solution(a: Int, b: Int): Int {
        val strAdd: String = a.toString() + b.toString()
        val IntAdd: Int = 2 * a * b

        return if (strAdd.toInt() > IntAdd) {
            strAdd.toInt()
        } else {
            IntAdd
        }
    }
}

import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        return max("$a$b".toInt(), 2 * a * b)
    }
}

 */

/* 더 크게 합치기
import kotlin.math.*

fun solution(a: Int, b: Int): Int {
    return max("$a$b".toInt(), "$b$a".toInt())
}
 */


//fun main() {
//    println(solution(2, 91))
//}