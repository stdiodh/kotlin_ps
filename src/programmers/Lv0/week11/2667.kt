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

/*
11월 20일 Daily 문제 정답 공개
해당 문제는 2차원 배열을 순회하며 아파트 단지의 수와 개수를 파악하는 문제입니다.
자세한 풀이는 어제 풀이와 동일합니다만, 배열을 공백없이 입력받아야 하는 것이 중요합니다.
Kotlin은 특히나 StreamTokenizer를 이용하여 공백없는 정수배열을 받는것이 힘듭니다. 따라서, 기본 내장된 입출력함수를 이용하는 것이 좋습니다.

import java.io.StreamTokenizer

fun main() {
    val n = readln().toInt()
    val graph = Array(n) { readln().map { it.toString().toInt() }.toIntArray() }
    val visited = Array(n) { BooleanArray(n) { false } }
    var cnt = 0
    val dx = arrayOf(0, 1, 0, -1);
    val dy = arrayOf(1, 0, -1, 0)
    fun dfs(x: Int, y: Int): Unit {
        for (i in 0..3) {
            val nx = x + dx[i];
            val ny = y + dy[i]
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue
            }
            if (!visited[nx][ny] && graph[nx][ny] == 1) {
                cnt++
                visited[nx][ny] = true
                dfs(nx, ny)
            }
        }
    }

    val result = mutableListOf<Int>()
    repeat(n) { x ->
        repeat(n) { y ->
            if (!visited[x][y] && graph[x][y] == 1) {
                cnt++
                visited[x][y] = true
                dfs(x, y)
                result.add(cnt)
                cnt = 0
            }
        }
    }
    val sb = StringBuilder()
    sb.appendLine(result.size)
    result.sorted().map { sb.appendLine(it) }
    print(sb)
}
 */