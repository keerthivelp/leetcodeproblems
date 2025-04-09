class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=0;
        int bestprev=values[0]+0;
        for(int i=1;i<values.length;i++){
            max=Math.max(max,bestprev+values[i]-i);
            bestprev=Math.max(bestprev,values[i]+i);
        }
        return max;
        
    }
}