
class MyLinkedList {

    private class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr;

        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail;
            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node newNode = new Node(val);
        Node prevNode = curr.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;

        newNode.next = curr;
        curr.prev = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        if (index == 0) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }

        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;

        size--;
    }
}