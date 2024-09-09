package ps1_10

//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//
//    while (scanner.hasNextInt()){
//        val a = scanner.nextInt()
//        val b = scanner.nextInt()
//        println(a+b)
//    }
//}
//
//fun main() {
//    val input = generateSequence(::readLine)
//    val lines = input.toList()
//    for (line in lines){
//        val (a, b) = line.split(" ").map {it.toInt()}
//        println(a + b)
//    }
//}
//
//fun main() {
//    while (true) {
//        val (a, b) = readln().split(" ").map { it.toInt() }
//        if (a == 0 && b == 0) { break }
//        else { println(a+b) }
//    }
//}
//
//fun main() {
//    val intCount = readln().toInt()
//    val nums = readln().split(" ")
//    val wantFindNum = readln().toInt()
//    println(nums.count { it.toInt() == wantFindNum })
//}