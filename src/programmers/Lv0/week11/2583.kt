package programmers.Lv0.week11

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int { nextToken(); return nval.toInt() }

    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    val m = nextInt(); val n = nextInt(); val k = nextInt()

    val graph = Array(m) { BooleanArray(n) { false } }
    val ans = mutableListOf<Int>()
    val sb = StringBuilder()

    repeat(k) {
        val x1 = nextInt(); val y1 = nextInt(); val x2 = nextInt(); val y2 = nextInt()

        for (i in x1..<x2) {
            for (j in y1..<y2) {
                graph[j][i] = true
            }
        }
    }

    //2차원 배열을 깊이탐색
    fun dfs(x: Int, y: Int) {
        graph[x][y] = true
        ans[ans.size - 1]++
        for (i in 0..<4) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                continue
            }
            if (!graph[nx][ny]) {
                dfs(nx, ny)
            }
        }
    }


    for (x in 0..<m) {
        for (y in 0..<n) {
            if (!graph[x][y]) {
                ans.add(0)
                dfs(x, y)
            }
        }
    }
    ans.sort()
    sb.appendLine("${ans.size}")
    ans.forEach { sb.append("$it ") }
    println(sb)
}