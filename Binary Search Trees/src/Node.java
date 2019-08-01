public class Node {
    private int data;
    private Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void setRightChild(Node n) {
        right = n;
    }

    public void setLeftChild(Node n) {
        left = n;
    }

    public Node getRightChild() {
        return right;
    }

    public Node getLeftChild() {
        return left;
    }

    public int getData() {
        return data;
    }

    public void setData(int x) {
        data = x;
    }
}
