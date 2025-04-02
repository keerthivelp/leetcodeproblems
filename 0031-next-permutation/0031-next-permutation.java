import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1; // Breakpoint index
        
        // Step 1: Find the rightmost index where nums[i] < nums[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        
        // If no breakpoint is found, reverse the entire array
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        // Step 2: Find the smallest number greater than nums[ind] from the right
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                // Swap nums[i] and nums[ind]
                swap(nums, i, ind);
                break;
            }
        }
        
        // Step 3: Reverse the portion to the right of ind to get the next permutation
        reverse(nums, ind + 1, n - 1);
    }
    
    // Helper function to reverse an array segment
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    
    // Helper function to swap two elements in an array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
