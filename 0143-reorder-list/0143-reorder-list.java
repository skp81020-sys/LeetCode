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
     public static ListNode reverse(ListNode head){
     
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
 public void reorderList(ListNode head) {
    if (head == null || head.next == null) return;

    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode second = slow.next;
    slow.next = null;              // first half yahin cut hota hai
    second = reverse(second);

    ListNode temp = head;
    while (temp != null && second != null) {
        ListNode a = temp.next;
        ListNode b = second.next;

        temp.next = second;
        second.next = a;

        temp = a;
        second = b;
    }
}

}