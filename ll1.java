class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to count the number of nodes in the linked list
    public int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class ll1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting elements at the beginning of the linked list
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        // Counting the number of nodes in the linked list
        int numberOfNodes = linkedList.countNodes();
        System.out.println("Number of nodes in the linked list: " + numberOfNodes); // Output: 3
    }
}
