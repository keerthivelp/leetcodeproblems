class Solution {
    public int jump(int[] nums) {
        int maxInd=0,jump=0,currentEnd=0;
        for(int i=0;i<nums.length-1;i++){
            maxInd=Math.max(maxInd,i+nums[i]);
            if(i==currentEnd){
                jump++;
                currentEnd=maxInd;
            }
        }
        return jump;    
            
        
    }
}