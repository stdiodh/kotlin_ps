package programmers.Lv0.week12

import java.io.StreamTokenizer
import java.util.LinkedList
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }
    val n = nextInt()
    val graph = Array(n) {
        IntArray(n) { nextInt() }
    }
    val dx = arrayOf(0, 1, 0, -1); val dy = arrayOf(1, 0, -1, 0)
    var visited = Array(n) { BooleanArray(n) { false } }
    fun bfs(x : Int, y : Int, h : Int) {
        val queue = LinkedList<Pair<Int, Int>>()
        queue.add(Pair(x, y))
        while (queue.isNotEmpty()) {
            val next = queue.poll()
            val kx = next.first; val ky = next.second
            for (i in 0..3) {
                val nx = kx + dx[i]
                val ny = ky + dy[i]
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue
                }
                if (!visited[nx][ny] && graph[nx][ny] > h) {
                    visited[nx][ny] = true
                    queue.add(Pair(nx,ny))
                }
            }
        }
    }
    var ans = 0
    repeat(100) { h ->
        var cnt = 0
        repeat(n) { x ->
            repeat(n) { y ->
                if (!visited[x][y] && graph[x][y] > h) {
                    cnt++
                    bfs(x, y, h)
                }
            }
        }
        ans = max(ans, cnt)
        visited = Array(n) { BooleanArray(n) { false } }
    }

    print(if (ans > 0) ans else 1)
}