import java.util.Scanner

fun main(args: Array<String>) {
      val scan =  Scanner(System.`in`)
        class Node(
            var key: Int,
            var left: Node? = null,
            var right: Node? = null) {
            fun insert(value: Int) {
                if (value > this.key) {
                    if (this.right == null) {
                        this.right = Node(value)
                    } else {
                        this.right!!.insert(value)
                    }
                } else if (value < this.key) {
                    if (this.left == null) {
                        this.left = Node(value)
                    } else {
                        this.left!!.insert(value)
                    }
                }
            }
            fun trv(node:Node , current : Node)
            {
                if (current != null)
                {
                    print("Root:")
                    println(current.key)
                    println("Left :1 : Right :2 , : parent :3 = ")
                    var ch = scan.nextInt()
                    if(node.left != null && ch==1) {  trv(current.left!!,current)}else{print("\nno data\n")}
                    if (node.right!=null && ch == 2) { trv(current.right!!,current)} else{print("\nno data\n")}
                    if(ch==3){in_order_Traverse(node)}

                }
            }
            fun in_order_Traverse(node : Node)
            {
               // print(node.key)
                if (node != null) {
                    print("Root:")
                    println(node.key)
                    println("Left :1 : Right :2")
                    var ch = scan.nextInt()
                    if(node.left != null && ch==1) {  trv(node,node.left!!)}else{print("\nno data\n")}
                    if (node.right!=null && ch == 2) { trv(node,node.right!!)} else{print("\nno data\n")}



                    //if(node.left != null) {  in_order_Traverse(node.left!!)}
                    //print("${node.key} ")
                    //if (node.right!=null) { in_order_Traverse(node.right!!)}


                }
            }

        }

        var tree = Node(5)
        tree.insert(3)
        tree.insert(7)
        tree.insert(1)
        tree.insert(9)


    println("InOrder_ Traversal :")
    tree.in_order_Traverse(tree)







}