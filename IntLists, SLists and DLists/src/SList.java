public class SList {
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode h) {
            item = i;
            next = h;
        }
    }

    private IntNode sentinel;
    private int size;

    public SList() {
        size = 0;
        sentinel = new IntNode(982734, null);
    }

    public SList(int x) {
        size = 1;
        sentinel = new IntNode(87312, null);
        sentinel.next = new IntNode(x, null);
    }

    public void insertFront(int x) {
        IntNode oldFrontNode = sentinel.next;
        IntNode newNode = new IntNode(x, oldFrontNode);
        sentinel.next = newNode;
        size += 1;
    }

    public int getFront() {
        return sentinel.next.item;
    }

    public void insertBack(int x) {
        size += 1;

        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    private IntNode getBackNode() {
        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        return p;
    }

    public int getBack() {
        IntNode back = getBackNode();
        return back.item;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SList s1 = new SList();
        s1.insertBack(6);
        s1.insertFront(4);
        s1.insertFront(3);
        System.out.println(s1.getBack());
        System.out.println(s1.getFront());
    }
}