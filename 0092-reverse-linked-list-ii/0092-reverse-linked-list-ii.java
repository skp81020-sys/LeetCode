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
        if(head==null || head.next==null) return head;

        ListNode curr=head;
        ListNode pre=null;
        while( curr!=null){
            ListNode Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }

        return pre;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a=null;
        ListNode b=null;
        ListNode c=null;
        ListNode d=null;

        ListNode temp=head;
        int n=1;
        while(temp!=null){
            if(n==left-1) a=temp;
            if(n==left)   b=temp;
            if(n==right)  c=temp;
            if(n==right+1) d=temp;

            temp=temp.next;
            n++;
        }

        if(a!=null) a.next=null;
          c.next=null;

        c=reverseList(b);
        if(a!=null) a.next=c;
        b.next=d;

        if(a!=null) return head;
        return c;
    }
}