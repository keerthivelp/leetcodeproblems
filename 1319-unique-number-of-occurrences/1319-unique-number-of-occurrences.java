class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
       HashMap <Integer,Integer> freq=new HashMap<>();
       for(int i=0;i<n;i++){
        freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);

       }
       HashSet<Integer> seenfreg=new HashSet<>();
       for(int count:freq.values()){
        if(seenfreg.contains(count)){
            return false;
        }
        seenfreg.add(count);
       }
       return true;
    
        
    }
}