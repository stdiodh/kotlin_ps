package programmers.Lv0.week4

/* n개 간격의 원소들
class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in 0 until num_list.size step n) {
            answer += num_list[x]
        }
        return answer
    }
}

class Solution {
    fun solution(nums: IntArray, n: Int) = nums.slice(nums.indices step n)
}
 */

/* 문자열 안에 문자열
class Solution {
    fun solution(str1: String, str2: String): Int {
        return if (str2 in str1) 1 else 2
    }
}
 */

/* 배열의 유사도
class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for(x in s1.indices){
            for(y in s2.indices){
                if(s1[x] == s2[y]){
                    answer+=1
                }
            }
        }
        return answer
    }
}

class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int = s1.count { s2.contains(it) }
}
 */

/* n보다 커질 때까지 더하기
class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        for(x in numbers.indices){
            answer += numbers[x]
            if(answer > n){
                break
            }
        }
        return answer
    }
}
 */

/* 접미사 배열
class Solution {
    fun solution(my_string: String): Array<String> {
        val answer = mutableListOf<String>()
        for (x in my_string.indices){
            answer.add(my_string.substring(x until my_string.length))
        }
        return answer.sorted().toTypedArray()
    }
}
 */

//fun main(){
//    val result = solution("banana")
//    result.forEach { println(it) }
//}