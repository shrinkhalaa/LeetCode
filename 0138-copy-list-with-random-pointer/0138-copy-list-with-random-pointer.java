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

        // Step 1: Create a mapping from original to copied node
        HashMap<Node, Node> map = new HashMap<>();
        Node current = head;

        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        // Step 2: Assign next and random pointers for the copied nodes
        current = head;
        while (current != null) {
            Node copy = map.get(current);
            copy.next = map.get(current.next);
            copy.random = map.get(current.random);
            current = current.next;
        }

        // Return the head of the copied list
        return map.get(head);
    }
}
