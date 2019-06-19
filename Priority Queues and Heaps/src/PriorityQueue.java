public class PriorityQueue {
    private int maxSize;
    private int[] queueArray;
    private int nItems;

    public PriorityQueue(int size) {
        maxSize = size;
        queueArray = new int[size];
        nItems = 0;
    }

    public void insert(int value) {
        if (nItems == maxSize) {
            throw new RuntimeException("queue is full");
        }
        if (nItems == 0) {
            queueArray[0] = value;
        } else {
            int j = nItems;
            while (j > 0 && queueArray[j - 1] > value) {
                queueArray[j] = queueArray[j-1];
                j--;
            }
            queueArray[j] = value;
        }
        nItems++;
    }
}
