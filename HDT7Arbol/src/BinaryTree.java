public class BinaryTree<E> {
    class Node {
        Object n = null;
        Node left;
        Node right;

        public BinaryTree(){

        }
        Node(Object n) {
            this.n = n;
            right = null;
            left = null;
        }

    }
}
