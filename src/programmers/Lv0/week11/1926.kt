package programmers.Lv0.week11

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt()
    val graph = Array(n) { IntArray(m) { nextInt() } }
    val visited = Array(n) { BooleanArray(m) }

    val dx = arrayOf(0, 1, 0, -1)
    val dy = arrayOf(1, 0, -1, 0)

    fun dfs(x: Int, y: Int): Int {
        var count = 1
        for (i in 0..3) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if (!visited[nx][ny] && graph[nx][ny] == 1) {
                visited[nx][ny] = true
                count += dfs(nx, ny)
            }
        }
        return count
    }

    val result = mutableListOf<Int>()

    for (x in 0..<n) {
        for (y in 0..<m) {
            if (!visited[x][y] && graph[x][y] == 1) {
                visited[x][y] = true
                result.add(dfs(x, y))
            }
        }
    }
    val sb = StringBuilder()
    sb.appendLine(result.size)
    if (result.isEmpty()){
        sb.appendLine(0)
    } else {
        result.sortDescending()
        sb.appendLine(result[0])
    }
    print(sb)
}