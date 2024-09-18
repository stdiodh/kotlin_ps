package programmers.Lv0.week2

/* 접미사인지 확인하기
class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        return if(my_string.endsWith(is_prefix)) 1 else 0
    }
}
 */

/* 문자열의 뒤의 n글자
class Solution {
    fun solution(my_string: String, n: Int) = my_string.slice(my_string.length - n until my_string.length)
}
class Solution {
    fun solution(my_string: String, n: Int): String {
        return my_string.takeLast(n)
    }
}
 */

/* 부분 문자열 이어 붙여 문자열 만들기
class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        val result = StringBuilder()
        for (x in my_strings.indices){
            result.append(my_strings[x].substring(parts[x][0], parts[x][1] + 1))
        }
        return result.toString()
    }
}

class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>) : String =
        my_strings.indices.joinToString("") { my_strings[it].substring(parts[it][0], parts[it][1] + 1) }
}
 */

/* 글자 이어 붙여 문자열 만들기
class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        val word = StringBuilder()
        for (x in index_list){
            word.append(my_string[x])
        }
        return word.toString()
    }
}

class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        return index_list.map { my_string[it] }.joinToString("")
    }
}
 */

/* 수 조작하기 1
class Solution {
    fun solution(n: Int, control: String): Int {
        var num = n
        for (x in control.indices) {
            if (control[x] == 'w') {
                num += 1
            } else if (control[x] == 's') {
                num -= 1
            } else if (control[x] == 'd') {
                num += 10
            } else if (control[x] == 'a') {
                num -= 10
            }
        }
        return num
    }
}

class Solution {
    fun solution(n: Int, control: String): Int {
        val map = mapOf('w' to 1, 's' to -1, 'd' to 10, 'a' to -10)
        return control.fold(n) { acc, w -> acc + map.getValue(w) }
    }
}
 */


//fun main(){
//    println( solution(0, control = "wsdawsdassw"))
//}