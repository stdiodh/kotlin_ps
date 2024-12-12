package programmers.Lv0.week14

//해당 문제는 이진 탐색을 사용하여 풀 수 있는 문제였습니다.
//주어진 자료 중 가장 큰 값이 정답이 될 수 있는 최소값이 되며, 자료의 합이 정답이 될 수 있는 최대 값이 됩니다.
//최소값과 최대값의 중간값으로 비교하며, 최대값과 최소값의 증감을 정하여 다시 중간값으로 비교하면서 최적의 해를 찾으면 되는 문제입니다.

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt()
    val arr = IntArray(n) { nextInt() }

    var start = arr.max(); var end = arr.sum()

    while(start < end){
        var count = 1
        val mid = (start + end) / 2
        var sum = 0
        for(num in arr){
            if(sum + num <= mid){
                sum += num
            } else {
                sum = num
                count++
            }
        }
        if(count <= m){
            end = mid
        } else {
            start = mid + 1
        }
    }
    println(start)
}