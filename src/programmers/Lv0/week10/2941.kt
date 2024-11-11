package programmers.Lv0.week10

fun main(){
    var input = readln()
    val croatia = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    croatia.forEach {
        input = input.replace(it, " ")
    }
    println(input.length)
}