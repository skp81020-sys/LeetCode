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
    public ListNode removeNodes(ListNode head) {
         ArrayList<Integer> s = new ArrayList<>();
        while(head!=null){
             int a=head.val;
             head=head.next;
             while(s.size() > 0 &&  s.get(s.size() - 1) < a){
                s.remove(s.size() - 1);
             }
             s.add(a);
        }

         head=new ListNode(s.get(0));
         ListNode c=head;
         for(int i=1;i<s.size();i++){
            int a=s.get(i);
            ListNode newNode=new ListNode(a);
            c.next=newNode;
            c=c.next;
         }

        return head;
    }
}