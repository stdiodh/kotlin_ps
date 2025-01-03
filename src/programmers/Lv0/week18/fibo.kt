package programmers.Lv0.week18
/*
fun main(){
    print(fibo(5))
}

fun fibo(n : Int) : Int{
    if(n == 1){
        return 1
    } else if (n == 0){
        return 0
    }
    return fibo(n-1) + fibo(n-2)
}

 */

fun main(){
    val dp = IntArray(6) { 0 }
    dp[1] = 1
    dp[2] = 1
    for(i in 3 .. 5){
        dp[i] = dp[i-1] + dp[i-2]
    }
    print(dp[5])
}
