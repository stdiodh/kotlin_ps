package programmers.Lv0

import kotlin.math.sqrt

/*
//제곱수 판별하기
class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        if (sqrt(n.toDouble()) % 1 == 0.0 ) answer = 1 else answer = 2
        return answer
    }
}
 */

/* 중복된 숫자 개수
class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var result : Int = 0
        for (x in array.indices){
            if(array[x] == n){
                result+=1
                }
            }
        return result
    }
}

//모범 답
class Solution {
    fun solution(array: IntArray, n: Int) = array.filter { it == n }.size
}
 */

/* 머쓱이보다 키 큰 사람
class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer : Int = 0
        for (x in array.indices){
            if(height < array[x]) answer += 1
        }
        return answer
    }
}

 */

/* 배열 두배 만들기
class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in numbers.indices){
            answer += numbers[x] * 2
        }
        return answer
    }
}

//모범 답
class Solution {
    fun solution(numbers: IntArray) = numbers.map { it * 2 }
}
 */

/* 특정 문자 제거하기
class Solution {
    fun solution(my_string: String, letter: String): String {
        return my_string.replace(letter, "")
    }
}
 */

