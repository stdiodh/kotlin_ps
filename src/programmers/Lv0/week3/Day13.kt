package programmers.Lv0.week3

/* 주사위 게임1
import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if (a % 2 == 1 && b % 2 == 1){
            answer = a.toDouble().pow(2).toInt() + b.toDouble().pow(2).toInt()
        } else if (a % 2 == 1 || b % 2 == 1){
            answer += 2 * (a + b)
        } else {
            answer += abs(a - b)
        }
        return answer
    }
}
 */

/* 뒤에서 5등까지
class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sorted().slice(0..4).toIntArray()
    }
}
 */

/* 배열의 원소만큼 추가하기
class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(x in arr.indices){
            repeat(arr[x]){
                answer+=arr[x]
            }
        }
        return answer
    }
}
 */

/* 문자열 바꿔서 찾기
class Solution {
    fun solution(myString: String, pat: String): Int {
        val answer = myString.toMutableList()

        for(x in answer.indices){
            if (answer[x] == 'A'){
                answer[x] = 'B'
            } else {
                answer[x] = 'A'
            }
        }

        return if(pat in answer.joinToString("")) 1 else 0
    }
}
 */

/* l로 만들기
class Solution {
    fun solution(myString: String): String {
        val answer = myString.toMutableList()
        for(x in answer.indices){
            if(answer[x].code < 'l'.code){
                answer[x] = 'l'
            }
        }
        return answer.joinToString("")
    }
}

class Solution {
    fun solution(myString: String) = myString.replace("[a-k]".toRegex(), "l")
}
 */


//fun main(){
//    val result = solution("ABBAA", "AABB")
//    println(result)
//}