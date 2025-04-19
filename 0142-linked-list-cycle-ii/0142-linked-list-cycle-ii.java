/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        
        HashMap<ListNode,Boolean> mpp=new HashMap<>();
        while(temp!=null){
            if(mpp.containsKey(temp)){
                return temp;
            }
            mpp.put(temp,true);
            temp=temp.next;
        }
        return null;
        
    }
}