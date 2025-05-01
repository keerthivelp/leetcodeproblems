import java.util.Arrays;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Custom sort by numeric value
        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length(); // Sort by length
            } else {
                return b.compareTo(a); // If same length, compare lexicographically
            }
        });

        
        return nums[k - 1];
    }
}
