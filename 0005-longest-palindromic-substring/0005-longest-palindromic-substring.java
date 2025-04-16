class Solution {
    public String longestPalindrome(String s) {
        String maxPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            
            String odd = expandAroundCenter(s, i, i);
            if (odd.length() > maxPalindrome.length()) {
                maxPalindrome = odd;
            }

            
            String even = expandAroundCenter(s, i, i + 1);
            if (even.length() > maxPalindrome.length()) {
                maxPalindrome = even;
            }
        }

        return maxPalindrome;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
}
