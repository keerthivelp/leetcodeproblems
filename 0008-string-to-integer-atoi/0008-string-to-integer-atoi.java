class Solution {
    public int myAtoi(String s) {
        if(s==null)return 0;
        s=s.trim();
        if(s.length()==0) return 0;

        int sign=+1;
        int ans=0;
        int i;
        if(s.charAt(0)=='-') sign=-1;

        int MAX=Integer.MAX_VALUE;
        int MIN=Integer.MIN_VALUE;
        i=(s.charAt(0)=='+'||s.charAt(0)=='-') ?1:0;


        while(i<s.length()){
            if(s.charAt(i)==' '||!Character.isDigit(s.charAt(i))) break;

            int digit = s.charAt(i) - '0';

             // Check for overflow before actually adding the digit
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;
            i++;

        }
        return (int)(sign*ans);


        
    }
}