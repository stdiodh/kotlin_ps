package programmers.Lv0.week2

/* 첫 번째로 나오는 음수
class Solution {
    fun solution(num_list: IntArray): Int {
        var answer : Int = 0
        for (x in num_list.indices){
            if (num_list[x] < 0){
                answer = x
                break
            } else
                answer = -1
        }
        return answer
    }
}
```

```kotlin
class Solution {
    fun solution(num_list: IntArray): Int {
        return num_list.indexOfFirst { it < 0 }
    }
}
 */

/* 카운트 다운
class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in start_num downTo end_num){
            answer+=x
        }
        return answer
    }
}

class Solution {
    fun solution(start: Int, end: Int): IntArray = (start downTo end).toList().toIntArray()
}
 */

/* 배열 만들기 1
class Solution {
    fun solution(n: Int, k: Int): IntArray = (k..n step k).toList().toIntArray()
}
 */

/* 접두사인지 확인하기
fun solution(my_string: String, is_prefix: String): Int {
    return if(my_string.startsWith(is_prefix)) 1 else 0
}
 */

/* 문자열의 앞의 n글자
class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer : String = ""
        for (x in 0 until n){
            answer += my_string[x]
        }
        return answer
    }
}

class Solution {
    fun solution(my_string: String, n: Int): String = my_string.slice(0 until n)
}
 */


//fun main(){
//    println(solution("banana", "ban"))
//
//}