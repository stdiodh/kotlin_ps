//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val n = sc.nextInt()
//    val m = sc.nextInt()
//    val array = IntArray(n) {it + 1}
//    val result = StringBuilder()
//
//    for (x in 0 until m){
//        var i = sc.nextInt() - 1
//        var j = sc.nextInt() - 1
//
//        while (i < j)
//        {
//            val temp = array[i]
//            array[i++] = array[j]
//            array[j--] = temp
//        }
//    }
//
//    for (y in array)
//        result.append("$y ")
//
//    println(result)
//}
//
//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val n = sc.nextInt()
//    val arr = mutableListOf<Double>()
//
//    repeat(n){
//        arr.add(sc.nextDouble())
//    }
//    val arrMax = arr.max()
//
//    for (i in 0 until n){
//        arr[i] = (arr[i] / arrMax) * 100
//    }
//
//    println("${arr.sum() / n}")
//}

//fun main() {
//    val str = readlnOrNull().toString()
//    val n = readlnOrNull()?.toInt()
//
//    println(str[n!! - 1])
//}