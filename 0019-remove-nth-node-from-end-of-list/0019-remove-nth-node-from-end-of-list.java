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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode newHead=reverseList(head);

        ListNode temp=newHead;
        int count=1;
        ListNode prev=null;
        while(temp!=null){
            
            if(count==n){
                if(prev==null){
                    newHead=temp.next;
                }
                else{
                    prev.next=temp.next;
                }
                break;
                
            }
            prev=temp;
            temp=temp.next;
            count++;
            

            

        }
        return reverseList(newHead);
        
    }
    private ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;

        return newHead;
        
    }
}