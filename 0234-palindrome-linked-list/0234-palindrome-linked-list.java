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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        //step 1
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        //step 2
        ListNode newHead=reverseList(slow.next);

        //step3
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null){
            if(first.val!=second.val){
                reverseList(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseList(newHead);
        return true;

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