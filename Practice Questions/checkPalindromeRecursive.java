public class checkPalindromeRecursive {
    public static boolean isPalindrome(String str, int i, int j) {
        if( i >= j) {
            return true;
        }

        if(str.charAt(i) != str.charAt(j)) {
            return false;
        }

        return isPalindrome(str, i+1, j-1);

    }
    public static void main(String[] args) {
        String str = "madama";
        int i = 0;
        int j = str.length() - 1;

        System.out.println(isPalindrome(str, i, j));


    }
}
