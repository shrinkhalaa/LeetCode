/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Insert copy nodes between original nodes
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        // Step 2: Assign random pointers to copied nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3: Separate the interleaved list into original and copied
        current = head;
        Node pseudoHead = new Node(0);
        Node copyCurrent = pseudoHead;

        while (current != null) {
            Node copy = current.next;
            copyCurrent.next = copy;
            copyCurrent = copy;

            current.next = copy.next; // restore original list
            current = current.next;
        }

        return pseudoHead.next;
    }
}

