package programmers.Lv0.week17

//1541. "-" 뒤부터 괄호를 치것을 더한 값을 첫 배열에 빼주면 최소값을 구할 수 있다.
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    //1. 입력을 받는다.
    // .split 을 통해 "-" 최소 값을 구하기 위해 미리 나눠준다.
    val n = br.readLine().split("-")
    //2. 첫 번째 배열의 총합 구하기
    var min = n[0].split("+").sumOf { it.toInt() }

    //2-1. 순회를 돌며 n의 두 번째 배열부터 더한 값을 빼주면 최소값을 구할 수 있다.
    //(두 번째 배열부터 하는 이유는 이미 min 은 첫 번째의 배열의 총합을 가지고 있기 때문이다.)
    for(x in 1..< n.size){
        min -= n[x].split("+").sumOf { it.toInt() }
    }
    //3. 결과를 출력한다.
    bw.write("$min")
    bw.flush()
    br.close()
    bw.close()
}