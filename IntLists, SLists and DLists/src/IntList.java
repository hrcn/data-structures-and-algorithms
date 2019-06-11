public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        head = h;
        tail = t;
    }

    public int size() {
        if (tail == null) {
            return 1;
        }
        return 1 + tail.size();
    }

    public int iterativeSize() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.tail;
        }
        return size;
    }

    public int get(int i) {
        if (i == 0) {
            return head;
        }

        return tail.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        L.tail.tail = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
    }
}