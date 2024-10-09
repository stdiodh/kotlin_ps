package ps11_20.ps12

fun main() {

    var result = 0

    repeat(readln().toInt()){
        val word = readln()

        for(x in word.indices){
            if(x != word.length -1){
                if(word[x] == word[x + 1]){
                    continue
                } else if (word[x] in word.substring(x+1, word.length)){
                    break
                }
            } else {
                result += 1
            }
        }
    }
    println(result)
}