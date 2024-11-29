package programmers.Lv0.week12

import java.io.StreamTokenizer
import java.util.LinkedList

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    val m = nextInt(); val n = nextInt();
    val queue = LinkedList<Pair<Int, Int>>()
    val graph = Array(n) { x -> IntArray(m) {y ->
        val t = nextInt()
        if (t == 1) { queue.add(Pair(x, y)) }
        t
    } }
    while (queue.isNotEmpty()) {
        val dx = arrayOf(0, 1, 0, -1); val dy = arrayOf(1, 0, -1, 0)
        val next = queue.poll()
        val x = next.first; val y = next.second
        for (i in 0 .. 3) {
            val nx = x + dx[i]; val ny = y + dy[i]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) { continue }
            if (graph[nx][ny] == 0) {
                graph[nx][ny] += graph[x][y] + 1
                queue.add(Pair(nx, ny))
            }
        }
    }
    // 2차원 배열을 1차원 배열 한 줄로 표현함
    val result = graph.flatMap { it.toList() }
    if (result.contains(0)) {
        print(-1)
    } else {
        print(result.max() - 1)
    }
}