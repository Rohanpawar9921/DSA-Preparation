public class Main {
    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

    public static int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            maxLen = Math.max(maxLen, Math.max(len1, len2));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abbdbb";
        System.out.println(longestPalindrome(s)); // Output: 5
    }
}
