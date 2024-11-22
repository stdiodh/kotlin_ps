package programmers.Lv0.week12

import java.io.StreamTokenizer
import java.util.LinkedList

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
    fun bfs(node : Int){
        val queue = LinkedList<Int>()
        queue.add(node)
        visited[node] = true
        while(queue.isNotEmpty()) {
            val curr = queue.poll()
            for (n in graph[curr]) {
                if (!visited[n]) {
                    ans++
                    visited[n] = true
                    queue.add(n)
                }
            }
        }
    }
    bfs(1)
    println(ans)
}