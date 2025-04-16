class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int fre[]=new int[26];
            for(int j=i;j<s.length();j++){
                fre[s.charAt(j)-'a']++;
                int beauty=maxfre(fre)-minfre(fre);
                sum+=beauty;
            }
        }
        return sum;   
    }
    public int maxfre(int []fre){
        int max=0;
        for(int i=0;i<26;i++){
            max=Math.max(max,fre[i]);
        }
        return max;
    }
    public int minfre(int []fre){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(fre[i]!=0){
                min=Math.min(min,fre[i]);
            }
        }
        return min;
    }
}