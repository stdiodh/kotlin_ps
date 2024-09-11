package programmers.Lv0

/* 점 위치 구하기
class Solution {
    fun solution(dot: IntArray): Int {
        var answer: Int = 0
        if (dot[0] > 0 && dot[1] > 0) answer = 1
        else if(dot[0] < 0 && dot[1] > 0) answer = 2
        else if (dot[0] < 0 && dot[1] < 0) answer = 3
        else answer = 4
        return answer
    }
}
 */

/* 배열의 평균값
class Solution {
    fun solution(numbers: IntArray): Double {
        var answer = 0.0
        for (x in numbers){
            answer += x
        }
        return answer / numbers.size
    }
}

//모범 답
class Solution {
    fun solution(numbers: IntArray) = numbers.average()
}
 */

/* 짝수 홀수 개수
class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        for(x in num_list){
            if (x % 2 == 0) answer[0] += 1
            else answer[1] += 1
        }
        return answer
    }
}
 */

/* 중앙 값 구하기
class Solution {
    fun solution(array: IntArray) : Int {
        array.sort()
        val size = array.size/2
        return array[size]
    }
}
 */

/* 짝수는 싫어요

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in 1..n step 2){
            answer += x
        }
        return answer
    }
}

//모범 답
class Solution {
    fun solution(n: Int) = (1..n).filter{ it % 2 == 1 }
}

 */


//fun main() {
//    val result = (solution(10))
//    result.forEach { println(it) }
//}