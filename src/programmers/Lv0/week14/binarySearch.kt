package programmers.Lv0.week14

fun main() {
    val arr = listOf(1,2,3,4,5,6,7,8,9,10)
    val result = binarySearch(arr, 7,0, arr.size-1)
    print("$result 번째 인덱스 안에 7 있음")
}

fun binarySearch(arr: List<Int>, target: Int, start: Int, end: Int) : Int {
    val mid = (start + end) / 2
    return if(arr[mid] == target){
        mid
    } else if(arr[mid] < target){
        binarySearch(arr, target, mid+1, end)
    } else {
        binarySearch(arr, target, start, mid-1)
    }
}