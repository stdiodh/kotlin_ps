package cs1_10

//fun main() {
//    val str = readln()
//    if(str == str.reversed()){
//        println("1")
//    } else {
//        println("0")
//    }
//}

//fun main() {
//    val n = readln().toInt()
//
//    for (x in 1 until n){
//        for (y in 1 until n - x + 1){
//            print(" ")
//        }
//        for (y in 1 until 2 * x){
//            print("*")
//        }
//        println()
//    }
//
//    for (x in n downTo 1){
//        for (y in 1 until n - x + 1){
//            print(" ")
//        }
//        for (y in 1 until 2 * x){
//            print("*")
//        }
//        println()
//    }
//}

fun main(){
   val str = readln()
   val strMap = mutableMapOf<Char, Int>()

    str.forEach {
        val char = it.lowercaseChar()

        if(strMap.containsKey(char)){
            strMap[char] = strMap[char]!!.plus(1)
        } else {
            strMap[char] = 1
        }
    }

    val max = strMap.maxBy { it.value }
    if(strMap.filter { it.value == max.value }.count() > 1){
        print("?")
    } else {
        print(max.key.uppercaseChar())
    }
}