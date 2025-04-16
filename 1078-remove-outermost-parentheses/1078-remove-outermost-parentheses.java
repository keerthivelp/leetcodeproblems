class Solution {
    public String removeOuterParentheses(String s) {
        int balance=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='('){
                if(balance>0){
                    result.append(c);
                }
                balance++;

            }
            else{
                balance--;
                if(balance>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
       
            
    }
}