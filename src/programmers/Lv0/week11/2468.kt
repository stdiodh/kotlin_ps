package programmers.Lv0.week11

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken(); return nval.toInt()
    }

    val n = nextInt()
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    val graph = Array(n) { IntArray(n) { nextInt() } }

    fun dfs(x: Int, y: Int, height: Int, visited: Array<BooleanArray>) {
        visited[x][y] = true
        for (i in 0 ..< 4) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx in 0 ..< n && ny in 0 ..< n && !visited[nx][ny] && graph[nx][ny] > height) {
                dfs(nx, ny, height, visited)
            }
        }
    }

    var maxSafeArea = 0
    val maxHeight = graph.maxOf { it.maxOrNull() ?: 0 }

    for (height in 0..maxHeight) {
        val visited = Array(n) { BooleanArray(n) { false } }
        var safeAreaCount = 0

        for (x in 0 ..< n) {
            for (y in 0 ..< n) {
                if (graph[x][y] > height && !visited[x][y]) {
                    safeAreaCount++
                    dfs(x, y, height, visited)
                }
            }
        }
        maxSafeArea = maxOf(maxSafeArea, safeAreaCount)
    }

    println(maxSafeArea)
}


/*
11월 18일 Daily 문제 정답 공개
문제에서 요구하는 안전 영역은 특정 강수량 이상의 높이를 가진 영역으로 구성된 부분입니다.
이는 DFS 알고리즘을 통해  2차원배열을 탐색하면서 강수량 이상의 높이로 구성된 영역을 식별하면 됩니다.
설명이 어려울 수 있으니 조금 풀자면, 강수량이 1인 경우 1보다 높은 모든 영역은 안전 영역입니다.
이러한 안전영역의 덩어리를 구해야하기 때문에 DFS를 수행하여 2차원 배열 순회중 안전 영역인 땅을 만나면 해당 영역과 좌우 상하로 붙어있는
모든 영역을 방문처리하고 카운팅합니다.
이러한 과정을 강수량의 범위에서 수행하면 됩니다. 영역의 높이는 최소 1부터 최대 100이므로 강수량이 1부터 100까지 모든 경우를 확인해보면 됩니다.
해당 경우를 확인하며 정답 변수에 최대값을 전달하면 정답을 출력할 수 있습니다.
안전영역의 개수가 최대 0인 경우가 분명히 있을 수 있습니다. 따라서, 0인 경우에는 반드시 1개의 안전영역을 갖는 것이 최대라고 출력해줘야 합니다.

import java.io.StreamTokenizer
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
    fun dfs(x : Int, y : Int, h : Int) {
        for(i in 0 ..3) {
            val nx = x + dx[i]; val ny = y + dy[i]
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) { continue }
            if (!visited[nx][ny] && graph[nx][ny] > h) {
                visited[nx][ny] = true
                dfs(nx, ny, h)
            }
        }
    }
    var ans = 0
    repeat(100) { h ->
        var cnt = 0
        repeat(n) { x ->
            repeat(n) { y ->
                if (!visited[x][y] && graph[x][y] > h) {
                    cnt ++
                    visited[x][y] = true
                    dfs(x, y, h)
                }
            }
        }
        ans = max(ans, cnt)
        visited = Array(n) { BooleanArray(n) { false } }
    }
    print(if (ans > 0) ans else 1)
}
 */
