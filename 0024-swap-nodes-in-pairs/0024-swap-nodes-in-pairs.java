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
    public ListNode reverse(ListNode head,int time){
        ListNode curr=head;
        ListNode prev=null;
        while(time > 0 ){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
            time--;
        }
        return prev;
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode left=head;
        ListNode prevleft=null;
        ListNode right=null;
        ListNode res=head.next;
        int k=2;
        while(true){
            right=left;
            for(int i=0;i<k-1;i++){
                if(right==null) break;
                right=right.next;
            }
            if (right != null) {
            ListNode nextleft = right.next;
            ListNode newHead = reverse(left, k);  
            if (prevleft == null) {
                res = newHead;    
            } else {
                prevleft.next = newHead;
            }
            prevleft = left;      
            left = nextleft;
        } else {
            if (prevleft != null) {
                prevleft.next = left;
            }
            break;
        }
    }
        return res;
    }
}