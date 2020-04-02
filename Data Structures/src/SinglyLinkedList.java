public class SinglyLinkedList {

    private ListNode head;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);

        if(head == null) return newNode;

        newNode.next = head;
        head = newNode;
        return head; // this head will be new head, having new node at beginning.
    }

    public ListNode insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;

        if(head == null) return newNode;

        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public void insertAfter(ListNode previous, int data) {
        if(previous == null) System.out.println("The given previous node cannot be null");

        ListNode newNode = new ListNode(data);
        newNode.next = previous.next;
        previous.next = newNode;
    }

    public void display() {
        if(head == null) return;

        ListNode current = head;
        // loop each element till end of the list
        // last node points to null
        while(current != null) {
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null"); // should be null
    }

    private int length() {
        if(head == null) return 0;

        int count = 0;
        ListNode current = head;

        while(current != null) {
            count++;
            current =  current.next;
        }
        return count;
    }

    public ListNode insertAtPosition(int data, int position) {
        // boundary checks
        int size = this.length();
        if(position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return head;
        }

        ListNode newNode = new ListNode(data);

        if(position == 1) {
            newNode.next = head;
            return newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
            return head;
        }
    }

    public ListNode deleteFirst() {
        if(head == null) return null;

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if(head == null) return null;

        ListNode last = head;
        ListNode previousToLast = null;
        while(last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;
        return last;
    }

    public ListNode deleteAtPosition(int position) {
        // boundary checks
        int size = this.length();
        if(position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return head;
        }

        if(position == 1) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            current.next = null;
            return previous;
        }
    }

    public boolean find(int searchKey) {
        if(head == null) return false;

        ListNode current = head;
        while(current != null) {
            if(current.data == searchKey) return true;
            current = current.next;
        }
        return false;
    }

    public ListNode reverse() {
        if(head == null) return head;

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMiddleNode() {
        if(head == null) return null;

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer!=null && fastPointer.next!=null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public ListNode getNthNodeFromEnd(int n) {
        if(head == null) return null;

        if(n <= 0) throw new IllegalArgumentException("Invalid n value");

        ListNode mainPointer = head;
        ListNode refPointer = head;
        int count = 0;

        while(count < n) {
            refPointer = refPointer.next;
            count++;
        }

        while(refPointer != null) {
            mainPointer = mainPointer.next;
            refPointer = refPointer.next;
        }

        return mainPointer;
    }

    public void removeDuplicateFromSortedLinkedList() {
        if(head == null) return;

        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertNodeToSortedSinglyLinkedList(int data) {
        ListNode newNode = new ListNode(data);

        if(head == null) return null;

        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;

        return head;
    }


}
