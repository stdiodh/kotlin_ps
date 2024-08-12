package cs1_10

//import java.util.Scanner
//
//fun main() = with(Scanner(System.`in`)){
//    val n = next()
//    val b = nextInt()
//    var result = 0
//
//    for (x in n.indices){
//        if (n[x] in '0'..'9'){
//            result = result * b + (n[x] - '0')
//        } else {
//            result = result * b + (n[x] - 'A' + 10)
//        }
//    }
//    print(result)
//}

//fun main() = with(Scanner(System.`in`)) {
//    var n = nextInt()
//    val b = nextInt()
//    val result = StringBuilder()
//
//    while (n > 0) {
//        if (n % b < 10) {
//            result.append((n % b + '0'.code).toChar())
//        } else {
//            result.append((n % b - 10 + 'A'.code).toChar())
//        }
//
//        n /= b
//    }
//
//    print(result.reversed())
//}

fun main() {
    val sb = StringBuilder()
    val coin = intArrayOf(25, 10, 5, 1)

    repeat(readln().toInt()){
        var n = readln().toInt()
        val cnt = arrayOf(0, 0, 0, 0)

        for (i in coin.indices){
            cnt[i] = n / coin[i]
            n %= coin[i]
        }
        sb.append("${cnt[0]} ${cnt[1]} ${cnt[2]} ${cnt[3]}\n")
    }
    print(sb)
}