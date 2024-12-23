package programmers.Lv0.week16

fun main() {
    val arr = listOf(
        listOf(2, 4, 3),
        listOf(1, 3, 7),
        listOf(6, 5, 6),
    )
    val check = mutableListOf(false, false, false)

    fun dfs(nums : List<Int>, row : Int) {
        if (row == 3) {
            nums.forEach { print("$it ") }
            println()
        }
        for (i in 0..2) {
            if (!check[i]) {
                check[i] = true
                dfs(nums + listOf(arr[row][i]), row + 1)
                check[i] = false
            }
        }
    }
    dfs(emptyList(), 0)
}