import java.util.List;

public class SinglyLinkedList {

    // private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode insertAtBeginning(ListNode head, int data) {
        ListNode newNode = new ListNode(data);

        if(head == null) return newNode;

        newNode.next = head;
        head = newNode;
        return head; // this head will be new head, having new node at beginning.
    }

    public ListNode insertAtEnd(ListNode head, int data) {
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

    public void display(ListNode head) {
        if(head == null) return;

        ListNode current = head;
        // loop each element till end of the list
        // last node points to null
        while(current != null) {
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println(current); // should be null
    }

    private int length(ListNode head) {
        if(head == null) return 0;

        int count = 0;
        ListNode current = head;

        while(current != null) {
            count++;
            current =  current.next;
        }
        return count;
    }

    public ListNode insertAtPosition(ListNode head, int data, int position) {
        // boundary checks
        int size = this.length(head);
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

    public ListNode deleteFirst(ListNode head) {
        if(head == null) return head;

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(ListNode head) {
        if(head == null) return head;

        ListNode last = head;
        ListNode previousToLast = null;
        while(last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;
        return last;
    }

    public ListNode deleteAtPosition(ListNode head, int position) {
        // boundary checks
        int size = this.length(head);
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

    public boolean find(ListNode head, int searchKey) {
        if(head == null) return false;

        ListNode current = head;
        while(current != null) {
            if(current.data == searchKey) return true;
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head) {
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

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        SinglyLinkedList SLL = new SinglyLinkedList();
        SLL.display(head);

        System.out.println();

        SLL.insertAfter(second, 15);
        SLL.display(head);
    }
}
