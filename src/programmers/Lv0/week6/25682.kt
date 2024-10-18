package programmers.Lv0.week6

import java.io.StreamTokenizer

// k*k의 체스판을 만드는 데 출력은 다시 칠해야 되는 칸의 갯수
fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }


}