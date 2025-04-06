class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            int last1=arr1.get(arr1.size()-1);
            int last2=arr2.get(arr2.size()-1);

            if(last1>last2){
                arr1.add(nums[i]);
            }

            else if(last2>last1){
                arr2.add(nums[i]);
            }
        }

        List<Integer> result=new ArrayList<>();

        result.addAll(arr1);
        result.addAll(arr2);

        int [] resArray=new int[result.size()];

        for(int i=0;i<result.size();i++){
            resArray[i]=result.get(i);
        }


        return resArray;

        
    }
}