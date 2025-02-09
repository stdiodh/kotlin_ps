package programmers.Lv0.week21

import kotlin.math.min

fun main() {
    val graph = listOf(
        emptyList(),
        listOf(Pair(2, 3), Pair(4, 6)),
        listOf(Pair(1, 4), Pair(3, 7)),
        listOf(Pair(1, 5) , Pair(4, 2)),
        listOf(Pair(3, 4))
    )
    val INF = 1_000_000_000L
    //최단 경로 기록 2차원 배열선언
    val dist = Array(5) { LongArray(5) { INF } }

    //자기 자신으로 가는 최단 경로는 0으로 초기화
    for (i in 1 .. 4){
        dist[i][i] = 0
    }

    //그래프 정보를 통해 인접 노드 가중치 초기화
    for(i in 1 .. 4){
        for((node, weight) in graph[i]){
            dist[i][node] = weight.toLong()
        }
    }

    //플로이드 워셜
//    for(k in 1..4){
//        for(i in 1..4){
//            for(j in 1..4){
//                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
//            }
//        }
//    }

    repeat(4){k ->
        repeat(4){i ->
            repeat(4){j ->
                dist[i + 1][j + 1] = min(dist[i + 1][j + 1], dist[i + 1][k + 1] + dist[k + 1][j + 1])
            }
        }
    }

    for(i in 1..4){
        for(j in 1..4){
            print("${dist[i][j]} ")
        }
        println()
    }
}