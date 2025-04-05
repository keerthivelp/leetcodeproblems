class Solution {
    public int distinctAverages(int[] nums) {
        List<Integer> list=new ArrayList<>();

        for(int n:nums){
            list.add(n);
        }
        Set<Double> result=new HashSet<>();

        while(!list.isEmpty())
        {
        int min=Collections.min(list);
        int max=Collections.max(list);

        double avge=(double)(min+max)/2;

        result.add(avge);

        list.remove(Integer.valueOf(min));
        list.remove(Integer.valueOf(max));
        }
        
      return result.size();  
    }
    
}