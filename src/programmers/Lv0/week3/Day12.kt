package programmers.Lv0.week3

/* 배열의 길이에 따른 다른 연산하기
class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        if(arr.size % 2 == 0){
            for(x in 1 until arr.size step 2){
                arr[x] += n
            }
        } else {
            for(x in arr.indices step 2){
                arr[x] += n
            }
        }
        return arr
    }
}
 */

/* 문자열로 변환
class Solution {
    fun solution(n: Int) = n.toString()
}
 */

/* 문자열을 정수로 변환하기
class Solution {
    fun solution(n_str: String) = n_str.toInt()
}
 */

/* 뒤에서 5등 위로
class Solution {
    fun solution(num_list: IntArray): IntArray {
        val answer = num_list.sorted().slice(5 until num_list.size).toIntArray()
        return answer
    }
}
 */

/* 문자열 정수의 합
class Solution {
    fun solution(num_str: String): Int {
        var total = 0
        val answer = num_str.toList().forEach { total += it.toString().toInt() }
        return total
    }
}

class Solution {
    fun solution(num_str: String): Int {
        return num_str.map{ it.digitToInt() }.sum()
    }
}
 */

//
//fun main() {
//    println(solution("123456789"))
//}