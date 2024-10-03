package programmers.Lv0.week4

/* n 번째 원소부터
class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.sliceArray(n-1 until num_list.size)
    }
}
 */

/* ad 제거하기
class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        val answer = mutableListOf<String>()
        for(x in strArr.indices){
            if(strArr[x].contains("ad")){
                continue
            } else {
                answer.add(strArr[x])
            }
        }
        return answer.toTypedArray()
    }
}

class Solution {
    fun solution(strArr: Array<String>) = strArr.filter { !it.contains("ad") }
}
 */

/* 주사위의 개수
class Solution {
    fun solution(box: IntArray, n: Int): Int {
        val x = box[0] / n
        val y = box[1] / n
        val z = box[2] / n
        return x * y * z
    }
}
 */

/* 약수 구하기
class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (x in 1..n){
            if(n % x == 0){
                answer += x
            }
        }
        return answer
    }
}
 */

/* 인덱스 바꾸기
class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val strNum2 = my_string[num2]
        val str = my_string.replaceFirst(my_string[num2], my_string[num1])
        return str.replaceFirst(my_string[num1], strNum2)
    }
}
 */

//fun main(){
//    val result = solution("hello", 1, 2)
//    println(result)
//}