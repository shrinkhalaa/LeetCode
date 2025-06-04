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
    public ListNode merged(ListNode list1, ListNode list2){
        ListNode curr1=list1;
        ListNode next1=list1.next;
        ListNode curr2=list2;
        ListNode next2=list2.next;
        while(next1!=null && curr2!=null){
            if(curr1.val<=curr2.val && curr2.val<=next1.val){
                curr1.next=curr2;
                next2=curr2.next;
                curr2.next=next1;
                curr1=curr2;
                curr2=next2;
            }
            else{
                curr1=curr1.next;
                next1=next1.next;
            }
            
        }
        if(curr2!=null){
            curr1.next=curr2;
        }
        return list1;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val>list2.val){
            return merged(list2,list1);
        }
        else{
            return merged(list1,list2);
        }
    }
}