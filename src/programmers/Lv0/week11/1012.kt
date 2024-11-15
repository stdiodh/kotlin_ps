package programmers.Lv0.week11

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int { nextToken(); return nval.toInt() }

    //1. 입력을 받는다.
    //가로 M, 세로 N, 배추가 심어져 있는 위치의 개수 k
    repeat(nextInt()){
        val dx = intArrayOf(1,0,-1,0)
        val dy = intArrayOf(0,1,0,-1)

        val m = nextInt(); val n = nextInt(); val k = nextInt()
        val graph = Array(n) { IntArray(m) { 0 } }
        val visited = Array(n) { BooleanArray(m) {false} }

        repeat(k){
            val x = nextInt(); val y = nextInt()
            graph[y][x] = 1
        }

        //2차원 배열을 깊이탐색
        fun dfs(x:Int, y:Int) : Unit{
            graph[x][y] = 0
            visited[x][y] = true
            for (i in 0..<4){
                val nx = x + dx[i]
                val ny = y + dy[i]
                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue
                }
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    dfs(nx,ny)
                }
            }
        }

        var ans = 0
        for(x in 0..<n){
            for(y in 0 ..<m){
                if(graph[x][y] == 1 && !visited[x][y]){
                    ans++
                    dfs(x,y)
                }
            }
        }
        println(ans)
    }
}