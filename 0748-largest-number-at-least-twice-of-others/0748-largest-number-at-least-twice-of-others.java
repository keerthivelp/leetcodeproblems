class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int second=-1;
        int maxIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                second=max;
                max=nums[i];
                maxIndex=i;
            }
            else if(nums[i]>second){
                second=nums[i];
            }
                

        }
        if(second*2<=max){
            return maxIndex;
        } 
        return -1;
        
    }
}