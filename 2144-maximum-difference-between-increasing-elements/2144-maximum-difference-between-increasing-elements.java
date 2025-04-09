class Solution {
    public int maximumDifference(int[] nums) {
        int maxDef=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    maxDef=Math.max(maxDef,nums[j]-nums[i]);
                    
                }   
            }
        }
        
        
        return maxDef;
        
    }
}