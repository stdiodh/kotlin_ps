package programmers.Lv0.week3

/* 콜라츠 수열 만들기
class Solution {
    fun solution(n: Int): IntArray {
        var num = n
        val list = mutableListOf<Int>()
        list.add(n)

        while(num != 1){
            if(num % 2 == 0){
                num /= 2
                list.add(num)
            } else {
                num = 3 * num + 1
                list.add(num)
            }
        }
        return list.toIntArray()
    }
}
 */

/* 공백으로 구분하기 2
class Solution {
    fun solution(my_string: String): Array<String> {
        var answer = my_string.split(" ").filter { it.isNotEmpty() }
        return answer.toTypedArray()
    }
}
 */

/* 배열 비교하기
class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        if (arr1.size < arr2.size) {
            return -1
        } else if( arr1.size > arr2.size) {
            return 1
        } else {
            if (arr1.sum() < arr2.sum()){
                return -1
            } else if (arr1.sum() > arr2.sum()){
                return 1
            } else {
                return 0
            }
        }
    }
}
 */

/* 정수 부분
class Solution {
    fun solution(flo: Double): Int {
        return flo.toInt()
    }
}
 */

/* rny_string
class Solution {
    fun solution(rny_string: String): String {
        return rny_string.replace("m", "rn")
    }
}
 */





//fun main(){
//    val result = solution(intArrayOf(1,2,3,4,5), intArrayOf(3,3,3,3,3))
//    println(result)
////    result.forEach { println(it) }
//}