/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode add=new ListNode(0);
        add.next=head;
        ListNode prev=add;//taaki mai end mein return kar saku
        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                add.next=head.next;
            }
            else{
                add=add.next;//moves only when no duplicate, to connect with unique elem later
            }
            head=head.next;//exploration pointer
        }
        return prev.next;
    }
}