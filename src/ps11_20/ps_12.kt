package ps11_20

import java.io.StreamTokenizer

/* 2941번
fun main() {
    val wordList = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var word = readln()

    wordList.forEach {
        word = word.replace(it, " ")
    }
    println(word.length)
}
 */

/*
fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    fun next() : String {
        nextToken()
        return sval
    }

    val word = mutableListOf<String>()

    repeat(nextInt()){
        word.add(next().chunked(1).toString())
    }

    for(x in word.indices){
        if(word.forEach{ it } in word.distinct()){
            word.remove(word[x])
        }
    }

    word.forEach { println(it) }


}
 */