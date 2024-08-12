package cs1_10

//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val str = sc.next()
//    val result = IntArray(26) { -1 }
//
//    for (x in str.indices){
//        val index = str[x] - 'a'
//        if (result[index] == -1){
//            result[index] = x
//        }
//    }
//    result.forEach { print("$it ") }
//}

//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    repeat(sc.nextInt()){
//        val n = sc.nextInt()
//        val str = sc.next()
//        var strRe = ""
//
//        for (x in str.indices){
//            repeat(n){
//                strRe += str[x]
//            }
//        }
//        println(strRe)
//    }
//}

fun main() {
    val str = readlnOrNull()!!.trim().split(" ").toMutableList()
    str.removeAll(listOf(""))
    println("${str.size}")
}