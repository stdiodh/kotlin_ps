package programmers.Lv0.week11

fun main() {
    val graph = arrayOf(
        //편의를 위해 0번 노드를 빈 배열로 만듬
        emptyArray(),
        arrayOf(2,3,4),
        arrayOf(1,3,5),
        arrayOf(1,2,4),
        arrayOf(1,3,6),
        arrayOf(2,6),
        arrayOf(4,5,7),
        arrayOf(6),
    )

    val visited = BooleanArray(8) { false }
    fun dfs(node: Int): Unit {
        println(node)
        for (n in graph[node]) {
            if (!visited[n]) {
                visited[n] = true
                dfs(n)
            }
        }
    }
    visited[1] = true
    dfs(1)
}