class Solution {
    public int minElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(digit(nums[i]));
        }
        return Collections.min(list);
    }
    private int digit(int n){
        int sum=0;
        while(n>0){
         sum+=n%10;
         n=n/10;
        }
        return sum;       
    }
        
    
}