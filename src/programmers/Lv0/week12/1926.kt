package programmers.Lv0.week12

import java.io.StreamTokenizer
import java.util.LinkedList

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt()
    val graph = Array(n) { IntArray(m) { nextInt() } }
    val visited = Array(n) { BooleanArray(m) { false } }

    val dx = arrayOf(0, 1, 0, -1)
    val dy = arrayOf(1, 0, -1, 0)

    fun bfs(x : Int, y : Int) : Int{
        var count = 1
        val queue = LinkedList<Pair<Int, Int>>()
        queue.add(Pair(x, y))
        while(queue.isNotEmpty()){
            val next = queue.poll()
            val kx = next.first; val ky = next.second
            for(i in 0..3){
                val nx = kx + dx[i]
                val ny = ky + dy[i]
                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue
                }
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    visited[nx][ny] = true
                    count += bfs(nx,ny)
                    queue.add(Pair(nx, ny))
                }
            }
        }
        return count
    }

    val result = mutableListOf<Int>()

    for(x in 0 ..< n){
        for(y in 0 ..< m){
            if(!visited[x][y] && graph[x][y] == 1){
                visited[x][y] = true
                result.add(bfs(x, y))
            }
        }
    }
    val sb = StringBuilder()
    sb.appendLine(result.size)
    if(result.isEmpty()){
        sb.appendLine(0)
    } else {
        result.sortDescending()
        sb.appendLine(result[0])
    }
    print(sb)
}