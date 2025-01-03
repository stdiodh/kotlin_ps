package programmers.Lv0.week18

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