package programmers.Lv0.week4

/* 배열에서 문자열 대소문자 변환하기
class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for(x in strArr.indices){
            if(x % 2 == 0){
                answer += strArr[x].lowercase()
            } else {
                answer += strArr[x].uppercase()
            }
        }
        return answer
    }
}
 */

/* 원하는 문자열 찾기
class Solution {
    fun solution(myString: String, pat: String): Int {
        return if (myString.lowercase().contains(pat.lowercase())) 1 else 0
    }
}
 */

/* 직각삼각형 출력하기
fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    for(x in 0 until n){
        for(y in 0..x){
            print("*")
        }
        println()
    }
}
 */

/*
 */

/* x 사이의 개수
class Solution {
    fun solution(myString: String) : IntArray {
        val answer = myString.split("x")
        var result : IntArray = intArrayOf()
        for (x in answer){
            result += x.length
        }
        return result
    }
}

class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()
        return myString.split("x").map { it.length }.toIntArray()
    }
}
 */

/* 할 일 목록
class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (x in todo_list.indices){
            if(finished[x]){
                continue
            } else {
                answer += todo_list[x]
            }
        }
        return answer
    }
}
 */

//fun main() {
//    val result = (solution("oxooxoxxox"))
//    result.forEach { println(it) }
//}