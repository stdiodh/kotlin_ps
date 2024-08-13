package cs11_20

//import java.util.Scanner
//
//fun main() {
//    val n = readln().toInt()
//    var room = 1
//    var result = 1
//
//    if (n == 1) {
//        println(result)
//    } else {
//        while ( room < n) {
//            room += result * 6
//            result++
//        }
//        println(result)
//    }
//}

//import java.util.Scanner
//
//fun main (){
//    val sc = Scanner(System.`in`)
//    val a = sc.nextInt()
//    val b = sc.nextInt()
//    val v = sc.nextInt()
//
//    print(if((v - a) % (a - b) == 0) (v - a) / (a - b) + 1 else (v - a) / (a - b) + 2)
//}

//import java.util.Scanner
//
//fun main() = with(Scanner(System.`in`)) {
//    val n = nextInt()
//    var result = 2
//
//    for (i in 0 until n) {
//        result += (result - 1)
//    }
//
//    print(result * result)
//}