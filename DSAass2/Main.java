package DSAass2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes
        list.insertAtPos(1, 10);
        list.insertAtPos(2, 20);
        list.insertAtPos(3, 30);
        list.insertAtPos(4, 40);
        list.printList(); // Output: 10 20 30 40

        // Delete a node at a given position
        list.deleteAtPosition(2);
        list.printList(); // Output: 10 30 40

        // Delete a node after a given node
        list.insertAtPos(3, 50);
        list.deleteAfterNode(list.head.next);
        list.printList(); // Output: 10 30 50

        // Search for a node
        System.out.println(list.searchNode(30)); // Output: true
        System.out.println(list.searchNode(60)); // Output: false

        // Stack implementation using Linked List
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.peek()); // Output: 20
    }
}

