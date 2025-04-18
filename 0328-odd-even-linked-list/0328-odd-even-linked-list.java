class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        
        while (temp != null) {
            arr.add(temp.val);
            if (temp.next == null) break;
            temp = temp.next.next;
        }

        
        temp = head.next;
        while (temp != null) {
            arr.add(temp.val);
            if (temp.next == null) break;
            temp = temp.next.next;
        }

       
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = arr.get(i++);
            temp = temp.next;
        }

        return head;
    }
}
