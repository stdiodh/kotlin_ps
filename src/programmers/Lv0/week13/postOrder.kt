package programmers.Lv0.week13

fun postOrderTraversal(node : Node?){
    if(node == null) { return }
    postOrderTraversal(node.left)
    postOrderTraversal(node.right)
    println(node.data)
}

fun main() {
    val a = Node('a')
    val b = Node('b')
    val c = Node('c')
    val d = Node('d')
    val e = Node('e')
    val f = Node('f')
    a.left = b
    a.right = c
    b.left = d
    b.right = e
    c.right = f
    postOrderTraversal(a)
}