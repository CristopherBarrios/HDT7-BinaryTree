public class BinaryTree<E> {
    class Node {
        Object n = null;
        Node left;
        Node right;


        Node(Object n) {
            this.n = n;
            right = null;
            left = null;
        }

    }
    public void setNode(Object Node) {
        this.n = Node;
    }

    public void insert(Object Node) {
        if (this.n == null){
            setNode(Node);
        }


    }
}
