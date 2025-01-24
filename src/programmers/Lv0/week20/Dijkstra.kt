package programmers.Lv0.week20

fun main() {
    val n = 6
    // 그래프의 정보를 입력을 받는다.
    val graph = listOf(
        emptyList(),
        listOf(listOf(2, 3), listOf(3, 5), listOf(5, 10)),
        listOf(listOf(3, 9), listOf(6, 12)),
        listOf(listOf(4, 2), listOf(6, 6)),
        listOf(listOf(6, 3)),
        listOf(listOf(4, 4), listOf(6, 4)),
        emptyList()
    )

    // 그래프의 방문 기록 배열 지정
    val visited = BooleanArray(n + 1)
    // 최단거리 테이블
    val dist = IntArray(n + 1) { Int.MAX_VALUE }

    //현재에서 가장 가까운 노드 반환 함수
    fun getMinNode(): Int {
        var minValue = Int.MAX_VALUE
        var idx = 0

        for (x in 1..n) {
            //모든 거리를 탐색해서
            //최솟값보다 더 작으면 그리고 방문을 하지 않았으면
            if (dist[x] < minValue && !visited[x]) {
                //최소값 갱신
                //반환값 인덱스 갱신
                minValue = dist[x]
                idx = x
            }
        }
        return idx
    }

    // 다익스트라 함수
    fun dijkstra(start: Int) {
        dist[start] = 0
        visited[start] = true

        // 시작 노드의 거리 갱신
        for (y in graph[start]) {
            dist[y[0]] = y[1]
        }

        // 모든 노드에 대해 반복
        for (z in 1..n) {
            val now = getMinNode()
            visited[now] = true

            // 현재 노드의 인접 노드 거리 갱신
            for (y in graph[now]) {
                // 현재 노드를 방문해서의 가중치 계산
                val cost = dist[now] + y[1]
                // 이 값이 더 작으면 갱신
                if (cost < dist[y[0]]) {
                    dist[y[0]] = cost
                }
            }
        }
    }
    dijkstra(1)

    for (i in 1..n) {
        if (dist[i] == Int.MAX_VALUE) {
            println("$i : INF")
        } else {
            println("$i : ${dist[i]}")
        }
    }
}
