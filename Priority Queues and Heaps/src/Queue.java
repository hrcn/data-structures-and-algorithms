public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean insert(int x) {
        if (nItems == maxSize) {
            return false;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = x;
        nItems++;
        return true;
    }

    public int remove() {
        if (nItems == 0) {
            System.out.println("queue is empty");
            return -1;
        }
        int temp = queueArray[front];
        front++;
        if (front == maxSize) front = 0;
        nItems--;
        return temp;
    }

    public int getSize() {
        return nItems;
    }

    public int peekFront() {
        return queueArray[front];
    }

    public int peekRear() {
        return queueArray[rear];
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(4);

        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(5);
        myQueue.insert(15);
    }
}
