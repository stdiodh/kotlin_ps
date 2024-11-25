package programmers.Lv0.week12

import java.util.*

fun main() {

    val input = readln().split(" ").map { it.toString().toInt() }
    val n = input[0]; val m = input[1]
    val graph = Array(n){ readln().map { it.toString().toInt() }.toIntArray() }
    val visited = Array(n) { BooleanArray(m) { false } }

    fun bfs(x : Int, y : Int){
        val dx = arrayOf(0,1,0,-1)
        val dy = arrayOf(1,0,-1,0)
        val queue = LinkedList<Pair<Int,Int>>()
        queue.add(Pair(x, y))
        while(queue.isNotEmpty()) {
            val next = queue.poll()
            val kx = next.first; val ky = next.second
            for(i in 0..3){
                val nx = kx + dx[i]
                val ny = ky + dy[i]
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    visited[nx][ny] = true
                    graph[nx][ny] += graph[kx][ky]
                    queue.add(Pair(nx,ny))
                }
            }
        }
    }
    bfs(0,0)
    print(graph[n - 1][m - 1])
}