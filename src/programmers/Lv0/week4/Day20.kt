package programmers.Lv0.week4

/* 삼각형의 완성조건 (1)
class Solution {
    fun solution(sides: IntArray): Int {
        val answer = sides.sorted()
        return if (answer[0] + answer[1] > answer[2]) 1 else 2
    }
}
 */

/* flag에 따라 다른 값 반환하기
class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        return if(flag) a+b else a-b
    }
}
 */

/* 최댓값 만들기 (2)
import kotlin.math.max

class Solution {
    fun solution(numbers: IntArray): Int {
        val answer = numbers.sorted()
        return max(answer[0] * answer[1], answer[answer.lastIndex] * answer[answer.lastIndex - 1])
    }
}
 */

/* 세균 증식
class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer : Int = n
        repeat(t){
            answer *= 2
        }
        return answer
    }
}

class Solution {
    fun solution(n: Int, t: Int): Int  = n shl t
}
 */

/* 특별한 이차원 배열 1
class Solution {
    fun solution(n: Int): Array<IntArray> {
        return Array(n) { x -> IntArray(n) { y -> if(x == y) 1 else 0} }
    }
}
 */


//fun main() {
//    val result = solution((3))
//    result.forEach { println(it.contentToString()) }
//}