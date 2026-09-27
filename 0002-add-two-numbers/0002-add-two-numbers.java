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
    ListNode head=null;
     ListNode tail=null;
     int carry=0;
     void Add(int data) {
        int sum = data + carry;
    int n = sum % 10;
    carry = sum / 10;
        ListNode newNode = new ListNode(n);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        while(l1!=null && l2!=null){
            int a=l1.val;
            int b=l2.val;
            Add(a+b);
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
             Add(l1.val);
              l1=l1.next;
        }

         while(l2!=null){
             Add(l2.val);
              l2=l2.next;
        }
        if(carry!=0){
             ListNode newNode = new ListNode(carry);
             tail.next = newNode;
            tail = newNode;
        }
        return head;
    }
}