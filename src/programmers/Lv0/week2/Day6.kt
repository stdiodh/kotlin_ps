package programmers.Lv0.week2

/* 암호 해독
class Solution {
    fun solution(cipher: String, code: Int) : String {
        var answer : String = ""
        for (x in code - 1 until cipher.length step code){
            answer+=cipher[x]
        }
        return answer
    }
}


class Solution {
    fun solution(cipher: String, code: Int) = cipher.indices.filter { index -> index % code == code - 1 }.map { cipher[it] }.joinToString("")
}
 */

//class Solution {
//    fun solution(my_string: String) : String {
//        val answer = my_string.map {
//            when {
//                it.isLowerCase() -> it.isUpperCase()
//                it.isUpperCase() -> it.isLowerCase()
//                else -> it
//            }
//        }.joinToString("")
//        return answer
//    }
//}

/* 대문자와 소문자
class Solution {
    fun solution(my_string: String) : String {
        val answer = my_string.map {
            when {
                it.isLowerCase() -> it.uppercase()
                it.isUpperCase() -> it.lowercase()
                else -> it
            }
        }.joinToString("")
        return answer
    }
}
 */

/* 가장 큰 수 찾기
class Solution {
    fun solution(array: IntArray) = intArrayOf(array.max(), array.indices.find { i -> array[i] == array.max() }!!)
}

class Solution {
    fun solution(array: IntArray) = array.maxOf { it }.let { max ->
        intArrayOf(max, array.indexOfFirst { it == max })
    }
}
 */

/* n의 배수 고르기
class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in numlist.indices){
            if(numlist[x] % n == 0){
                answer+=numlist[x]
            }
        }
        return answer
    }
}

class Solution {
    fun solution(n: Int, numList: IntArray) = numList.filter { it % n == 0 }.toIntArray()
}
 */

/*
class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in 0 until n){
            answer+=num_list[x]
        }
        return answer
    }
}

//모범 답
class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray = num_list.slice(0 until n).toIntArray()
}

 */



//fun main() {
//    val solution = solution(intArrayOf(5, 2, 1, 7, 5), 3)
//    solution.forEach { println(it) }
//}


//fun main(){
//    val solution = (solution(3, intArrayOf(4, 5, 6, 7, 8, 9, 10, 11, 12)))
//    solution.forEach { println(it) }
//}