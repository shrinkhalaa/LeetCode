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
    public ListNode mid(ListNode head){
        ListNode slow=head, fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverseMid(ListNode head){
        ListNode prev=null, curr=head;
        while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid=mid(head);
        mid.next=reverseMid(mid.next);
        ListNode head1=head, head2=mid.next;
        while(head1!=mid.next && head2!=null){
            if(head1.val!=head2.val){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
}