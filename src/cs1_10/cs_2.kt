package cs1_10

//fun main() {
//    val (a, b, c) = readln().split(" ").map { it.toInt() }
//    val nums = listOf(a, b ,c)
//    if (a == b && b == c){
//        print( 10000 + a * 1000 )
//    }
//    else if (a == b || b == c || a == c) {
//        when {
//            a == b -> {
//                print( 1000 + a * 100 )
//            }
//            b == c -> {
//                print( 1000 + b * 100 )
//            }
//            else -> {
//                print ( 1000 + c * 100 )
//            }
//        }
//    }
//    else {
//        print( nums.max() * 100)
//    }
//}
//
//
//fun main() {
//    val total = readln().toLong()
//    val count = readln().toInt()
//    var totalCheck : Long = 0
//
//    for (i in 1..count) {
//        val (a, b) = readln().split(" ").map { it.toLong() }
//        totalCheck += a * b
//    }
//    if (total == totalCheck){
//        print("Yes")
//    }
//    else { print("No") }
//}
//
//fun main() {
//    val byte = readln().toLong()
//    for (i in 1..byte/4)
//    {
//        print("long ")
//    }
//    print("int")
//}