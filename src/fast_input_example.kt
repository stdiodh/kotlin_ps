//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val arr = Array(n) {
//        readln().split(" ").map { it.toInt() }
//    }
//
//    val pSum = Array(n + 1) {
//        Array(n + 1) { 0 }
//    }
//
//    repeat(n) { idx ->
//        repeat(n) { jdx ->
//            pSum[idx+1][jdx+1] = pSum[idx][jdx + 1] + pSum[idx + 1][jdx] - pSum[idx][jdx] + arr[idx][jdx]
//        }
//    }
//
//    repeat(m) {
//        val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }
//        println(pSum[x2][y2] - pSum[x2][y1 - 1] - pSum[x1 - 1][y2] + pSum[x1 - 1][y1 - 1])
//    }
//}



//import java.io.StreamTokenizer

// 빠른 입출력
//fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
//    fun nextInt() : Int {
//        nextToken()
//        return nval.toInt()
//    }
//
//    fun next() : String {
//        nextToken()
//        return sval
//    }
//
//    println(readLine())
//    println(next())

//
//    val n = nextInt()
//    val m = nextInt()
//    val pSum = Array<IntArray>(n+1 ) {
//        IntArray(n+1 ) { 0 }
//    }
//    repeat(n) { idx ->
//        repeat(n) {jdx ->
//            pSum[idx+1][jdx+1] = pSum[idx][jdx + 1] + pSum[idx + 1][jdx] - pSum[idx][jdx] + nextInt()
//        }
//    }
//
//    val sb = StringBuilder()
//    repeat(m){
//        val x1 = nextInt()
//        val y1 = nextInt()
//        val x2 = nextInt()
//        val y2 = nextInt()
//        sb.appendLine(pSum[x2][y2] - pSum[x1 - 1][y2] - pSum[x2][y1 - 1] + pSum[x1 - 1][y1 - 1])
//    }
//    print(sb)
//}


