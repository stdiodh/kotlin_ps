package programmers.Lv0.week4

/* 순서 바꾸기
class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer = num_list.toMutableList().take(n)
        var result : IntArray = intArrayOf()
        for(x in n until num_list.size){
            result += num_list[x]
        }

        return result + answer.toIntArray()
    }
}

class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.sliceArray(n until num_list.size) + num_list.sliceArray(0 until n)
}
 */

/* 길이에 따른 연산
class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 1
        if(num_list.size >= 11){
            for (x in num_list){
                answer = num_list.sum()
            }
        } else {
            for (x in num_list) {
                answer *= x
            }
        }
        return answer
    }
}
 */

/* 대문자로 바꾸기
class Solution {
    fun solution(myString: String) = myString.uppercase()
}
 */

/* 조건에 맞게 수열 변환하기 1
class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        for (x in arr){
            if (x < 50 && x % 2 != 0){
                answer.add(x * 2)
            } else if (x >= 50 && x % 2 == 0){
                answer.add(x / 2)
            } else {
                answer.add(x)
            }
        }
        return answer.toIntArray()
    }
}
 */

/* 수 조작하기 2
class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        for(x in 1 until  numLog.size){
            if(numLog[x] - numLog[x - 1] == 1){
                answer += 'w'
            } else if (numLog[x] - numLog[x - 1] == -1){
                answer += 's'
            } else if (numLog[x] - numLog[x - 1] == 10){
                answer += 'd'
            } else {
                answer += 'a'
            }
        }
        return answer
    }
}

class Solution {
    fun solution(numLog: IntArray): String {
        return (1..numLog.lastIndex).map {
            when (numLog[it] - numLog[it-1]) {
                1 -> 'w'
                -1 -> 's'
                10 -> 'd'
                else -> 'a'
            }
        }.joinToString("")
    }
}

 */


//fun main (){
//    val result = solution(intArrayOf(1, 2, 3, 100, 99, 98))
//    result.forEach { println(it) }
////    println(result)
//}