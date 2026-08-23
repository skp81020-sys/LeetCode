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
    public ListNode reverseList(ListNode head) {
        // Base Condtion
        if(head == null  || head.next==null) {
            return head;
        }

        ListNode pre=head;
        ListNode curr=head.next;
        pre.next=null;
        while(curr.next !=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }

         curr.next=pre;
         head=curr;
         return head;
    }
}