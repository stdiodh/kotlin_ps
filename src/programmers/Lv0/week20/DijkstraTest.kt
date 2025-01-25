package programmers.Lv0.week20

fun main(){
    val n = 6
    // 그래프의 정보를 입력을 받는다.
    val graph = arrayOf(
        emptyArray(),
        arrayOf(Pair(2, 3), Pair(3, 5), Pair(5, 10)),
        arrayOf(Pair(3, 9), Pair(6, 12)),
        arrayOf(Pair(4, 2), Pair(6, 6)),
        arrayOf(Pair(6, 3)),
        arrayOf(Pair(4, 4), Pair(6, 4)),
        emptyArray()
    )
    val INF = Long.MAX_VALUE
    val visited = BooleanArray(n+1) { false }
    val dist = LongArray(n+1) { INF }

    fun getMinDistNode() : Int {
        var minV = INF
        var idx = 0
        for(i in 1 .. n){
            if (dist[i] < minV && !visited[i]){
                minV = dist[i]
                idx = i
            }
        }
        return idx
    }

    fun dijkstra(start : Int){
        dist[start] = 0
        visited[start] = true
        for(j in graph[start]){
            dist[j.first] = j.second.toLong()
        }

        repeat(n){
            val now = getMinDistNode()
            visited[now] = true
            for(j in graph[now]){
                val cost = dist[now] + j.second
                if(cost < dist[j.first]){
                    dist[j.first] = cost
                }
            }
        }
    }

    dijkstra(1)
    for(i in 1 .. n){
        if(dist[i] == INF){
            println("$i : INF")
        } else {
            println("$i : ${dist[i]}")
        }
    }
}