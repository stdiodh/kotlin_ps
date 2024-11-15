package programmers.Lv0.week11

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    val graph = Array(nextInt()+1) { mutableListOf<Int>() }
    val visited = BooleanArray(graph.size){false}

    repeat(nextInt()){
        val x = nextInt(); val y = nextInt()
        graph[x].add(y)
        graph[y].add(x)
    }

    var ans = 0
    fun dfs(node:Int) : Unit{
        for (n in graph[node]){
            if(!visited[n]){
                ans++
                visited[n] = true
                dfs(n)
            }
        }
    }
    visited[1] = true
    dfs(1)
    println(ans)
}