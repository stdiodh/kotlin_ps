package programmers.Lv0.week12

import java.util.LinkedList
import java.util.Queue

fun main() {
    val graph = arrayOf(
        //편의를 위해 0번 노드를 빈 배열로 만듬
        emptyArray(),
        arrayOf(2, 3, 4),
        arrayOf(1, 3, 5),
        arrayOf(1, 2, 4),
        arrayOf(1, 3, 6),
        arrayOf(2, 6),
        arrayOf(4, 5, 7),
        arrayOf(6),
    )

    val visited = BooleanArray(8) { false }
    fun bfs(node : Int) {
        val queue : Queue<Int> = LinkedList<Int>()
        queue.add(node)
        visited[node] = true
        while(queue.isNotEmpty()){
            val curr = queue.poll()
            println(curr)
            for(n in graph[curr]){
                if (!visited[n]){
                    visited[n] = true
                    queue.add(n)
                }
            }
        }
    }
    bfs(1)
}