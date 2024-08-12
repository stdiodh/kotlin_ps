package cs1_10

//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val M = sc.nextInt()
//    val arrayN = IntArray(N)
//    val result = StringBuilder()
//
//    for(m: Int in 0 until M) {
//        val i = sc.nextInt()
//        val j = sc.nextInt()
//        val k = sc.nextInt()
//
//        for (insert: Int in i..j) {
//            arrayN[insert - 1] = k
//        }
//    }
//
//    for (i in arrayN) {
//        result.append("$i ")
//    }
//
//    println(result)
//    sc.close()
//}

//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val M = sc.nextInt()
//    val arrayN = IntArray(N) {it + 1}
//    val result = StringBuilder()
//
//    for (y : Int in 0 until M){
//        val i = sc.nextInt()
//        val j = sc.nextInt()
//        val k = arrayN[i - 1]
//        arrayN[i - 1] = arrayN[j - 1]
//        arrayN[j - 1] = k
//    }
//
//    for (a in arrayN){
//        result.append("$a ")
//    }
//    println(result)
//    sc.close()
//}

//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val arrayX = IntArray(30) { it + 1 }.toMutableList()
//
//    for (x in 1 .. 28) {
//        val num = sc.nextInt()
//        if (num in arrayX) {
//            arrayX.remove(num)
//        }
//    }
//    println("${arrayX[0]}\n${arrayX[1]}")
//}