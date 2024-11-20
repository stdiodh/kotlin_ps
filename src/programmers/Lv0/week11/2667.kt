package programmers.Lv0.week11

fun main() {
    val n = readln().toInt()
    val graph = Array(n) { IntArray(n) }
    val visited = Array(n) { BooleanArray(n) }

    // 지도 정보 입력받기
    repeat(n) { x ->
        val line = readln()
        for(y in line.indices){
            graph[x][y] = line[y] - '0'
        }
    }

    val dx = arrayOf(0, 1, 0, -1)
    val dy = arrayOf(1, 0, -1, 0)

    fun dfs(x: Int, y: Int): Int {
        var count = 1
        for (i in 0..3) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue
            if (!visited[nx][ny] && graph[nx][ny] == 1) {
                visited[nx][ny] = true
                count += dfs(nx, ny)
            }
        }
        return count
    }

    val result = mutableListOf<Int>()

    for (x in 0 ..< n) {
        for (y in 0 ..< n) {
            if (!visited[x][y] && graph[x][y] == 1) {
                visited[x][y] = true
                result.add(dfs(x, y))
            }
        }
    }

    val sb = StringBuilder()
    sb.appendLine(result.size)
    result.sorted().forEach { sb.appendLine(it) }
    print(sb)
}