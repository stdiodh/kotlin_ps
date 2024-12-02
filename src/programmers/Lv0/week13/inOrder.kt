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
    inOrderTraversal(a)
}