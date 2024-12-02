package programmers.Lv0.week13

/*
class Node(
    val data : Char, // any
) {
    var left : Node? = null
    var right : Node? = null
}
 */

fun inOrderTraversal(node : Node?){
    if(node == null) { return }
    inOrderTraversal(node.left)
    println(node.data)
    inOrderTraversal(node.right)
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
    inOrderTraversal(a)
}