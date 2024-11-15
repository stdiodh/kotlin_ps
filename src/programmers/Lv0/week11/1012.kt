package programmers.Lv0.week11

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int { nextToken(); return nval.toInt() }

    //1. 입력을 받는다.
    //가로 M, 세로 N, 배추가 심어져 있는 위치의 개수 k
    repeat(nextInt()){
        val m = nextInt(); val n = nextInt(); val k = nextInt()
        val graph = Array(m) { IntArray(n) { 0 } }
        val visited = BooleanArray(graph.size){false}

        repeat(k){
            val x = nextInt(); val y = nextInt()
            graph[y][x] = 1
        }

        //2차원 배열을 깊이탐색
        var ans = 0
        fun dfs(x:Int, y:Int) : Unit{
            for (n in graph[x]){
                for(m in graph[y]){
                    if(!visited[n]){
                        ans++
                        visited[n] = true
                        dfs(n,m)
                    }
                }
            }
        }
        visited[0] = true
        dfs(0,0)
        println(ans)
    }
}