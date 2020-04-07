import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    // 前序遍历 root --> left --> right
    public void preOrderRecursive(TreeNode root) {
        if(root == null) return;

        System.out.println(root.data + "");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void preOrderIterative() {
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.println(temp.data + " ");
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
    }

    // 中序遍历 left --> root --> right
    public void inOrderRecursive(TreeNode root) {
        if(root == null) return;

        inOrderRecursive(root.left);
        System.out.println(root.data + " ");
        inOrderRecursive(root.right);
    }

    public void inOrderIterative() {
        if(root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    // 后序遍历 left --> right --> root
    public void postOrderRecursive(TreeNode root) {
        if(root == null) return;

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.println(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.createBinaryTree();

        bt.preOrderRecursive(bt.root);
        bt.preOrderIterative();

        bt.inOrderRecursive(bt.root);
    }
}
