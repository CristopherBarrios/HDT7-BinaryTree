public class BinaryTree<E> {
    public class Node{
        Object n = null;
        Node left;
        Node right;

        public Node(Object n) {
            this.n = n;
            right = null;
            left = null;
        }

    }
    public void setNode(Object Node) {
        this.Node = Node;
    }

    public void insert(Object Node) {
        if (this.Node == null){
            setNode(Node);
        }


    }
}
