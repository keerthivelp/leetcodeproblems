class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;


       
        int currentAltitude=0;
        int max=0;

        for(int i=0;i<gain.length;i++){
            currentAltitude= currentAltitude + gain[i];
            max=Math.max(max,currentAltitude);
        }
        return max;


        
    }
}