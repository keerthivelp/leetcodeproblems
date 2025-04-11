import java.util.*;

public class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int code : barcodes) {
            freqMap.put(code, freqMap.getOrDefault(code, 0) + 1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int key : freqMap.keySet()) {
            maxHeap.offer(new int[]{key, freqMap.get(key)});
        }

        int[] result = new int[barcodes.length];
        int i = 0;

        int[] prev = new int[]{-1, 0};  

        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            result[i++] = curr[0];
            curr[1]--;

            
            if (prev[1] > 0) {
                maxHeap.offer(prev);
            }

            prev = curr;
        }

        return result;
    }
}
