package programmers.Lv0.week3

/* 부분 문자열 O(1)
class Solution {
    fun solution(str1: String, str2: String): Int {
        var result = if (str1 in str2) 1 else 0
        return result
    }
}
 */

/* 홀수 vs 짝수 O(x)
import kotlin.math.max

class Solution {
    fun solution(num_list: IntArray): Int {
        var oddSum : Int = 0
        var evenSum : Int = 0

        for (x in num_list.indices step 2){
            evenSum += num_list[x]
        }

        for (x in 1 until num_list.size step 2){
            oddSum += num_list[x]
        }

        return max(evenSum, oddSum)
    }
}

import kotlin.math.max

class Solution {
    fun solution(num_list: IntArray): Int {
        val evenSum = num_list.filterIndexed { i, _ -> i % 2 == 1 }.sum()
        val oddSum = num_list.filterIndexed { i, _ -> i % 2 == 0 }.sum()

        return max(evenSum, oddSum)
    }
}
 */

/* 정수 찾기 O(1)
class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        val answer : Int = if (n in num_list) 1 else 0
        return answer
    }
}
 */

/* 부분 문자열인지 확인하기 O(1)
class Solution {
    fun solution(my_string: String, target: String): Int {
        val answer: Int = if(my_string.contains(target)) 1 else 0
        return answer
    }
}
 */

/* 0 뗴기 O(1)
class Solution {
    fun solution(n_str: String): String {
        return n_str.trimStart('0')
    }
}
 */

//fun main() {
//    println(solution(intArrayOf(-1, 2, 5, 6, 3)))
//}