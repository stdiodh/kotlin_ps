package programmers.Lv0.week10

import java.io.StreamTokenizer
import kotlin.math.*

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    //1. 입력받기
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt(); val b = nextInt()
    val mine = Array(n){ IntArray(m) {nextInt()} }

    //2. 최대, 최소 높이 구하기
    var minH = 257
    var maxH = 0

    for(i in 0 ..< n){
        for(j in 0 ..< m){
            val height = mine[i][j]
            maxH = max(maxH, height)
            minH = min(minH, height)
        }
    }

    //3. 파는데 걸리는 건 2초, 놓는데 걸리는 것은 1초
    var minTime = Int.MAX_VALUE
    var resultH = 0

    for(h in minH .. maxH){
        var inven = b
        var time = 0

        for(x in 0 ..< n){
            for(y in 0 ..< m){
                if(mine[x][y] < h){
                    //3-1. 높이보다 작기에 블록을 놓아야함.
                    val drop = h - mine[x][y]
                    time += drop
                    inven -= drop
                } else if(mine[x][y] > h){
                    //3-2. 높이보다 크기에 파야함.
                    val drop = mine[x][y] - h
                    time += drop * 2
                    inven += drop
                }
            }
        }

        //4. 작업 불가능시 블록을 파는 경우의 수
        if(inven >= 0 && time <= minTime) {
            minTime = time
            resultH = h
        }
    }
    println("$minTime $resultH")
}