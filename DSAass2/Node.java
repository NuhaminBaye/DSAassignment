package DSAass2;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Insert a node at a given position
    public void insertAtPos(int position, int value) {
        Node newNode = new Node(value);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a node at a given position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Invalid position");
            return;
        }

        Node toDelete = current.next;
        current.next = current.next.next;
        toDelete = null;
    }

    // Delete a node after a given node
    public void deleteAfterNode(Node givenNode) {
        if (givenNode == null ||givenNode.next == null) {
            System.out.println("Invalid input");
            return;
        }

        Node nodeToDelete = givenNode.next;
        givenNode.next = givenNode.next.next;
        nodeToDelete = null;
    }

    // Search for a node with a given value
    public boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Stack implementation using Linked List
class Stack {
    private Node top;

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }
}
