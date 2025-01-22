package programmers.Lv0.week19

class Heapq<T : Comparable<T>>{
    private val data = mutableListOf<T>()
    private val areSorted : (T, T) -> Boolean = {a, b -> a < b}

    //size 메소드로 데이터 크기를 반환해야 함.
    val size : Int
        get() = data.size
    //peek() 메소드로 첫 번째 원소를 반환해야함 없으면 null 반환

    fun peek(): T? {
        return data.firstOrNull()
    }

    //enqueue() 메소드로 원소를 입력받음
    fun enqueue(element : T) : Unit{
        data.add(element)
        siftUp()
    }

    //siftUp() 메소드로 원소 재정렬을 수행함
    //siftUp() 메소드는 내부 데이터를 힙 자료에 맞게 재정렬을 함
    private fun siftUp() : Unit{
        var child : Int = data.size - 1
        var parent : Int = (child - 1) / 2
        while(child > 0 && areSorted(data[child], data[parent])){
            data.swap(child, parent)
            child = parent
            parent = (child - 1) / 2
        }
    }

    private fun MutableList<T>.swap(i : Int, j : Int){
        val tmp = this[i]
        this[i] = this[j]
        this[j] = tmp
    }

    //dequeue() 메소드를 통해서 루트 노드를 추출한다.
    //siftDown()을 수행한다.
    fun dequeue(element : T) : T?{
        if (data.isEmpty()) return null
        val root = data.first()
        val last = data.removeAt(data.size - 1)
        if (data.isNotEmpty()) {
            data[0] = last
            siftDown()
        }
        return root
    }

    private fun siftDown() : Unit {
        //자식이 올라와야 하는데
        //우선순위가 두번째 인 애랑 그 뒤 자식들이 올라와야 함
        //부모에는 왼쪽 인덱스가
        //오른쪽 인덱스는 왼쪽에 이동하는 것의 반복
        var parent = 0
        while(true){
            val leftChild = parent * 2 + 1
            val rightChild = parent * 2 + 2
            var change = parent

            if (leftChild < data.size && areSorted(data[leftChild], data[change])) {
                change = leftChild
            }
            if (rightChild < data.size && areSorted(data[rightChild], data[change])) {
                change = rightChild
            }
            if(change == parent){
                break
            }
            data.swap(parent, change)
            parent = change
        }
    }

    //siftDown() 메소드는 자료구조의 규칙에 맞게 다시 데이터를
    //재정렬한다.


    override fun toString(): String {
        return data.toString()
    }

}

fun main() {
    val n = Heapq<Int>()
    n.enqueue(1)
    n.enqueue(2)
    n.enqueue(4)
    n.enqueue(3)
    n.enqueue(6)
    n.enqueue(5)
    println(n.peek())
    println(n.size)
    println(n)
    n.dequeue(3)
    println(n)
}
