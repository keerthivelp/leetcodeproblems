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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        int count=0;
        HashMap<ListNode,Integer> mpp=new HashMap<>();
        while(temp!=null){
            if(mpp.containsKey(temp)){
                return true;
            }
            mpp.put(temp,count++);
            temp=temp.next;
        }
        return false;
        
    }
}