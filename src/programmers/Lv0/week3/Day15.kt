package programmers.Lv0.week3

/* 5명씩
class Solution {
    fun solution(names: Array<String>): Array<String> {
        val list = mutableListOf<String>()
        for(x in 0 until names.size step 5){
            list.add(names[x])
        }
        return list.toTypedArray()
    }
}
 */

/* 공백으로 구분하기 1
class Solution {
    fun solution(my_string: String): Array<String> {
        val answer = my_string.split(" ").toTypedArray()
        return answer
    }
}
 */

/* 가위 바위 보
class Solution {
    fun solution(rsp: String): String {
        val answer = rsp.toMutableList()
        var result : String = ""
        for(x in answer.indices){
            if (answer[x] == '2'){
                result += '0'
            } else if (answer[x] == '5'){
                result += '2'
            } else{
                result += '5'
            }
        }
        return result
    }
}
 */

/* A 강조하기
class Solution {
    fun solution(myString: String): String {
        return myString.lowercase().replace('a', 'A')
    }
}
 */

/* 특정한 문자를 대문자로 바꾸기
class Solution {
    fun solution(my_string: String, alp: String): String {
        return my_string.replace(alp, alp.uppercase())
    }
}
 */

//fun main (){
//    val result = solution("programmers", "p")
//    result.forEach { println(it) }
//}