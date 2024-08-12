package cs1_10

import java.util.Scanner

//fun main() {
//    val str = readlnOrNull()
//    str?.let { println(it.length) }
//}

//import java.util.Scanner
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val case = sc.nextInt()
//    for (x in 0 until case){
//        val str = sc.next()
//        println("${str[0]}${str[str.lastIndex]}")
//    }
//}

//fun main() {
//    println("${readln().first().code}")
//}

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val num = sc.next()
    var total = 0

    for (x in 0 until  n){
        total += num[x] - '0'
    }

//    다른 풀이
//    for (x in num){
//        total += (x - '0')
//    }
//    println(total)

    println(total)
}