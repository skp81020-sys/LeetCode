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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        //fing length
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        k = k % len;

        if(k == 0) return head;
        temp=head;
        
        for(int i=1;i<len-k;i++){
            temp=temp.next;
        }
        ListNode newNode=temp.next;
        temp.next=null;
        temp=newNode;
        while(temp.next!=null){
            temp=temp.next;
        }
         temp.next=head;
        return newNode;
    }
}