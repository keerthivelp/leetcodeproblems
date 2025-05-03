public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.append(sum % 2); 
            carry = sum / 2;        // carry for next digit

            i--;
            j--;
        }

        return result.reverse().toString();


        /*a[i] = 1, b[j] = 1, carry = 0

         sum = 1 + 1 + 0 = 2

         result = "01" (append 2 % 2 = 0)

         carry = 1 (since 2 / 2 = 1)

         Move to next digits: i = 1, j = 1*/
    }
}
