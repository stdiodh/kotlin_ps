package programmers.Lv0.week15

import java.io.StreamTokenizer
import kotlin.math.min


fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    //1. 입력
    val n = nextInt(); val m = nextInt()

    val board = Array(n) {
        nextString()
    }
    var ans = n * m

    //2. 체스판 탐색
    //체스판 시작 좌표를 기준으로
    //8*8 짜리 2차원 배열을 순회하면서
    //체스판을 다시 칠하는 칸을 카운팅
    for (x in 0..<n-7){
        for (y in 0..<m-7){
            //흰색일 때 다시 칠해야 하는 경우, 검은색일 때 다시 칠하는 경우
            var w = 0
            var b = 0

            //if 왼쪽 맨 위가 흰색으로 시작하는 경우
            //else 왼쪽 맨 위가 검은색으로 시작하는 경우
            for (dx in x ..<x+8){
                for(dy in y ..<y+8){
                    if ((dx+dy) % 2 == 0){
                        if(board[dx][dy] == 'B'){
                            w += 1
                        } else {
                            b += 1
                        }
                    } else {
                        if (board[dx][dy] == 'W'){
                            w += 1
                        } else {
                            b += 1
                        }
                    }
                }
            }
            ans = min(ans, min(w, b))
        }
    }
    print(ans)
}
