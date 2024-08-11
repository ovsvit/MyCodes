import java.util.HashSet;

public class loop_detection {

    static Node head; // head of list

    /* Linked list Node */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at the front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of the new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to the new Node */
        head = new_node;
    }

    // Returns true if there is a loop in the linked
    // list, else returns false.
    public boolean detectLoop() {
        HashSet<Node> s = new HashSet<>();
        Node h = head;
        while (h != null) {
            // If we have already encountered this node
            // in the HashSet, it means there is a cycle.
            if (s.contains(h))
                return true;

            // If we are seeing the node for the
            // first time, insert it into the HashSet.
            s.add(h);

            h = h.next;
        }

        return false;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        loop_detection llist = new loop_detection(); // Changed from MyLinkedList to loop_detection
    
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
    
        /* Create loop for testing */
        llist.head.next.next.next.next = llist.head;
    
        if (llist.detectLoop())
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}
