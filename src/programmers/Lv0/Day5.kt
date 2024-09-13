package programmers.Lv0

import kotlin.math.ceil

/* 피자 나눠 먹기 (1)
class Solution {
    fun solution(n: Int): Int = ceil(n.toDouble() / 7).toInt()
}
 */

/* 옷가게 할인받기
class Solution {
    fun solution(price: Int): Int {
        var answer: Double = 0.0
        if (price in 0 .. 99999){
            answer += price
        }else if(price in 100000 .. 299999) {
            answer = price * 0.95
        } else if (price in 300000 .. 499999){
            answer = price * 0.9
        } else {
            answer = price * 0.8
        }
        return answer.toInt()
    }
}

class Solution {
    fun solution(price: Int): Int {
        val discount =  when {
            price >= 500_000 -> 0.80
            price >= 300_000 -> 0.90
            price >= 100_000 -> 0.95
            else -> 1.0
        }
        return (discount * price.toDouble()).toInt()
    }
}
 */

/* 아이스 아메리카노
class Solution {
    fun solution(money: Int): IntArray {
        val n : Int = money / 5500
        val m : Int = money - (5500 * n)
        return intArrayOf(n, m)
    }
}
 */

/* 개미군단
class Solution {
    fun solution(hp : Int) : Int{
        val a = hp / 5
        val b = (hp-(5*a))/3
        val c = (hp-(5*a)-(3*b))/1
        return a+b+c
    }
}
 */

/* 숨어있는 숫자의 덧셈 (1)
class Solution {
    fun solution(my_string: String): Int {
        var answer : Int = 0
        for (x in my_string.indices){
            if(my_string[x] in '1'..'9'){
                answer += my_string[x].toString().toInt()
            }
        }
        return answer
    }
}


class Solution {
    fun solution(my_string: String)= my_string.filter{ it.isDigit() }.map{ it.toString().toInt() }.sum()
}
 */

//fun main() {
//    println((solution("aAb1B2cC34oOp")))
//}