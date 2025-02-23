package programmers.Lv0.week21

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val v = nextInt(); val e = nextInt()
    val k = nextInt()
    val INF = 1_000_000_000
    val graph = Array(v+1) { mutableListOf<Pair<Int, Int>>() }
    val dist = IntArray(v+1) { INF }
    val visited = BooleanArray(v+1) { false }

    repeat(e){
        val a = nextInt(); val b = nextInt(); val c = nextInt()
        graph[a].add(Pair(b, c))
    }

    fun getMinDistNode() : Int {
        var minV = INF
        var idx = -1
        for(i in 1 .. v){
            if(dist[i] < minV && !visited[i]){
                minV = dist[i]
                idx = i
            }
        }
        return idx
    }

    fun dijkstra(start: Int) {
        dist[start] = 0

        for ((next, weight) in graph[start]) {
            dist[next] = weight
        }

        repeat(v - 1) {
            val now = getMinDistNode()
            if (now == -1) return

            visited[now] = true
            for ((next, weight) in graph[now]) {
                val cost = dist[now] + weight
                if (cost < dist[next]) {
                    dist[next] = cost
                }
            }
        }
    }

    dijkstra(k)
    for(i in 1 .. v){
        if(dist[i] == INF){
            println("INF")
        } else {
            println(dist[i])
        }
    }
}