package programmers.Lv0.week17

import java.io.StreamTokenizer
import kotlin.math.abs

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    //1. 숫자를 입력
    val n = nextInt()
    //2. 체스판 생성
    val arr = IntArray(n) { 0 }
    //3. 경우의 수 변수와 조건 생성
    var cnt = 0

    fun isPossible(board : IntArray, row : Int) : Boolean{
        for(x in 0..< row){
            //조건. 현재 퀸 자리는 이전 퀸의 자리의 같은 행과 열에 or 대각선 row-col, row+col 에 들어갈 수 없음
            if(board[x] == board[row] || (row-x == abs(board[row]-board[x])))
                return false
        }
        return true
    }

    fun dfs(board : IntArray, row : Int){
        //3-4. 한 행씩 퀸을 두면서 내려왔고, 현재 행이 n과 같아졌다면 경우의 수를 하나 추가
        if (row == n) {
            cnt++
            return
        }
        for (i in 0..< n) {
            //3-1. 가지를 치는데 친 것에 겹치지 않는지 확인하도록 보드에 i를 대입
            board[row] = i
            //3-2. 현재 행(col)의 열(row)에 퀸을 둘 수 있다면 다음 행(col)을 이어서 탐색
            if (isPossible(board, row)) {
                dfs(board, row+1)
            }
            //3-3. 현재 행(col)의 열(row)에 퀸을 둘 수 없다면 현재 행(col)의 다음 열(row)에서 탐색
        }
    }

    dfs(arr, 0)
    //4. 정답 출력
    print(cnt)
}