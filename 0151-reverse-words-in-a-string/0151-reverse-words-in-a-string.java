class Solution {
    public String reverseWords(String s) {
        String t="";
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;

            int j=i;
            if(i<0) break;

            while(i>=0 && s.charAt(i)!=' ') i--;

            for(int k=i+1;k<=j;k++){
                t+=s.charAt(k);
            }
            if(i>=0){
                t+=' ';
            }
        }
        
       return t.trim(); 
    }
}