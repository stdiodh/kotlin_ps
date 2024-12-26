package programmers.Lv0.week8

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    //1. 입력받기
    val n = nextInt(); val pwdN = nextInt()
    val pwd = nextString()
    val a = nextInt(); val c = nextInt(); val g = nextInt(); val t = nextInt()

    //2. a,c,g,t를 카운트할 배열 생성
    var (cntA, cntC, cntG, cntT) = arrayOf(0, 0, 0, 0)

    var ans = 0
    //2-1. 첫 단어에 A, C, G, T 갯수 찾기
    repeat(pwdN) {
        when (pwd[it]) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }
    }
    if (a <= cntA && c <= cntC && g <= cntG && t <= cntT) ans++

    //3. 슬라이딩 하면서 A, C, G, T 단어 찾기
    var ptr = pwdN
    while(n > ptr) {
        //3-1. 슬라이딩 한칸 앞으로 갈 때의 A, C, G, T 갯수 추가
        when (pwd[ptr]) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }

        //3-2. 슬라이딩 한칸 앞으로 갈 때 한칸 뒤에 있는 A, C, G, T 갯수 제거
        when(pwd[ptr - pwdN]){
            'A' -> cntA--
            'C' -> cntC--
            'G' -> cntG--
            'T' -> cntT--
        }

        if (a <= cntA && c <= cntC && g <= cntG && t <= cntT) ans++
        ptr++
    }
    print(ans)
}