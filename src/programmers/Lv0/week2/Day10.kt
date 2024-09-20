package programmers.Lv0.week2

/* 문자 리스트를 문자열로 변환하기
class Solution {
    fun solution(arr: Array<String>): String {
        var answer = StringBuilder()
        for(x in arr){
            answer.append(x)
        }
        return answer.toString()
    }
}

class Solution {
    fun solution(arr: Array<String>) = arr.joinToString("")
}
 */

/* 홀짝 구분하기
fun main(args: Array<String>) {
    val a = readln().toInt()
    if (a % 2 == 0){
        println("$a is even")
    } else {
        println("$a is odd")
    }
}
 */

/* 카운트 업
class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in start_num .. end_num){
            answer += x
        }
        return answer
    }
}

class Solution {
    fun solution(start: Int, end: Int): IntArray = (start..end).toList().toIntArray()
}
 */

/* 조건에 맞게 수열 변환하기 3
class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in arr.indices) {
            if (k % 2 == 0) answer += arr[x] + k else answer += arr[x] * k
        }
        return answer
    }
}

class Solution {
    fun solution(arr : IntArray, k : Int) = arr.map{ if (k % 2 == 0) it + k else it * k }
}
 */

/* 꼬리 문자열
class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        return str_list.filterNot { it.contains(ex) }.joinToString("")
    }
}
 */
