class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        
        List<Integer> re=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/3&& !re.contains(nums[i])){
                re.add(nums[i]);
            }
            
            
        }
        return re;
        
    }
}