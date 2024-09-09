package programmers.Lv0

/* 두 수의 나눗셈
class Solution {
    fun solution(num1: Int, num2: Int) = num1 * 1000 / num2
}
*/

/* 각도기
class Solution {
    fun solution(angle: Int) : Int {
        var result : Int = 0
        if (angle in 1..89){
            result = 1
        }
        else if (angle == 90){
            result = 2
        }
        else if (angle in 91 .. 179){
            result = 3
        }
        else if (angle == 180){
            result = 4
        }
        return result
    }
}


// 모범 답
class Solution{
    fun solution(angle: Int) = when {
        (angle in 1..89) -> 1
        (angle == 90) -> 2
        (angle in 91..179) -> 3
        else -> 4
    }
}
*/

/* 짝수의 합
class Solution {
    fun solution (n: Int): Int{
        var answer : Int = 0
        for (i in 0..n step 2){
            answer += i
        }
        return answer
    }
}
 */

/* 두 수의 합
class Solution {
    fun solution(num1: Int, num2: Int) = num1 + num2
}
 */

/* 양꼬치
class Solution {
    fun solution(n: Int, k: Int): Int {
        val service : Int = 2000 * (n / 10)
        val total : Int = (n * 12000) + (k * 2000) - service
        return total
    }
}
 */