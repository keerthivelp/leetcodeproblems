import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        int[] greater = new int[nums2.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            greater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(element);
        }

        // Build result from greater[] array
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = greater[j];
                    break;
                }
            }
        }

        return result;
    }
}
