package programmers.Lv0.week13

fun postOrderTraversal(node : Node?){
    if(node == null) { return }
    postOrderTraversal(node.left)
    postOrderTraversal(node.right)
    println(node.data)
}

fun main() {
    val a = Node('A')
    val b = Node('B')
    val c = Node('C')
    val d = Node('D')
    val e = Node('E')
    val f = Node('F')
    a.left = b
    a.right = c
    b.left = d
    b.right = e
    c.right = f
    postOrderTraversal(a)
}