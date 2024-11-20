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

    /*
    11월 19일 Daily 문제 답안 공개
    이 문제는 문제에서 주어진 모든 것을 구현하면 해결할 수 있습니다.
    그 전에 문제에서 요구하는 좌표에 대해서 이해해봅시다. 좌표는 왼쪽 하단부터 오른쪽 상단으로 이어집니다. 이는 좌표 평면이 단순하게 회전된 형태로 다시 회전시키면 일반 좌표로 볼 수 있습니다.
    그래프를 모두 1 또는 0으로 초기화합니다. 그리고 주어진 좌표 쿼리를 통해 해당 좌표들을 모두 원래의 값과 다른 값을 할당합니다.
    이제 dfs를 수행합니다. dfs를 수행하면서 초기화된 값이 변하지 않았다면 색칠이 되지 않았기에 정답 배열을 선언하여 너비를 카운팅하고 추가해줍니다.
    문제에서는 영역의 개수와 각각의 넓이의 오름차순 정렬을 출력합니다. 그렇기에 정답 배열의 크기와 정답 배열을 정렬하여 단순하게 1줄로 모두 출력해주면 됩니다.

    import java.io.StreamTokenizer

    fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
        fun nextInt() : Int { nextToken(); return nval.toInt() }
        val m = nextInt(); val n = nextInt(); val k = nextInt()
        var graph = Array(n) { IntArray(m) {0} }
        var visited = Array(n) { BooleanArray(m) {false} }
        repeat(k) {
            val x1 = nextInt(); val y1 = nextInt(); val x2 = nextInt(); val y2 = nextInt()
            for (x in x1..<x2) {
                for (y in y1 ..< y2) {
                    graph[x][y] = 1
                }
            }
        }
        var result = mutableListOf<Int>()
        var cnt = 1
        val dx = arrayOf(0, 1, 0, -1)
        val dy = arrayOf(1, 0, -1, 0)
        fun dfs(x : Int, y : Int) : Unit {
            for (i in 0 .. 3) {
                val nx = x + dx[i]; val ny = y + dy[i]
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) { continue }
                if (!visited[nx][ny] && graph[nx][ny] == 0) {
                    visited[nx][ny] = true
                    cnt ++
                    dfs(nx, ny)
                }
            }
        }
        repeat(n) {x ->
            repeat(m) {y ->
                if (!visited[x][y] && graph[x][y] == 0) {
                    visited[x][y] = true
                    dfs(x, y)
                    result.add(cnt)
                    cnt = 1

                }
            }
        }
        val sb = StringBuilder()
        sb.appendLine(result.size)
        result.sorted().forEach { s ->
            sb.append("$s ")
        }
        print(sb)
    }
     */
}