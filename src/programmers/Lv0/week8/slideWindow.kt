package programmers.Lv0.week8

fun main() {
    val x = 3
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sum = 0

    repeat(x){
        sum += arr[it]
    }
    var ans = sum
    for (y in x ..< arr.size) {
        sum += arr[y] - arr[y - x]
        if (ans < sum) {
            ans = sum
        }
        println(ans)
    }
}