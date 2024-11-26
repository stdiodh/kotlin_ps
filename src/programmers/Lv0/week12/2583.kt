package programmers.Lv0.week12

import java.io.StreamTokenizer
import java.util.LinkedList

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val m = nextInt(); val n = nextInt(); val k = nextInt()
    val graph = Array(n) { IntArray(m) { 0 } }
    val visited = Array(n) { BooleanArray(m) { false } }
    repeat(k){
        val x1 = nextInt(); val y1 = nextInt(); val x2 = nextInt(); val y2 = nextInt()
        for(x in x1..<x2){
            for(y in y1..<y2){
                graph[x][y] = 1
            }
        }
    }

    val result = mutableListOf<Int>()
    var cnt = 1
    val dx = arrayOf(0,1,0,-1)
    val dy = arrayOf(1,0,-1,0)
    fun bfs(x: Int, y: Int) {
        val queue = LinkedList<Pair<Int, Int>>()
        queue.add(Pair(x, y))
        while (queue.isNotEmpty()) {
            val next = queue.poll()
            val kx = next.first; val ky = next.second
            for(i in 0.. 3){
                val nx = kx + dx[i]
                val ny = ky + dy[i]
                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue
                }
                if(!visited[nx][ny] && graph[nx][ny] == 0){
                    visited[nx][ny] = true
                    cnt++
                    queue.add(Pair(nx, ny))
                }
            }
        }
    }
    repeat(n){ x ->
        repeat(m){y ->
            if(!visited[x][y] && graph[x][y] == 0){
                visited[x][y] = true
                bfs(x, y)
                result.add(cnt)
                cnt = 1
            }
        }
    }
    val sb = StringBuilder()
    sb.appendLine(result.size)
    result.sorted().forEach {
        sb.append("$it ")
    }
    print(sb)
}