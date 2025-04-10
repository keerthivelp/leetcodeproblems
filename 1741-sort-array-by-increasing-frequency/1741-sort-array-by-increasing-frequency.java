import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;

        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        
        Integer[] boxed = new Integer[n];
        for (int i = 0; i < n; i++) {
            boxed[i] = nums[i];
        }

        
        Arrays.sort(boxed, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB)
                return freqA - freqB;
            else
                return b - a;
        });

        
        for (int i = 0; i < n; i++) {
            nums[i] = boxed[i];
        }

        return nums;
    }
}
