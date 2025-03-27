public class substringWithSameStartAndEndIndex {
    
    public static int substringCount(String str, int start, int i, String newString) {
        // Base case: If the end index reaches the string length, stop expanding
        if (i == str.length()) {
            return 0;
        }

        // Append current character to new substring
        newString += str.charAt(i);
        System.out.println("Checking substring: " + newString);

        // Count the substring if first and last character are the same
        int count = (newString.charAt(0) == newString.charAt(newString.length() - 1)) ? 1 : 0;
        
        // Expand substring by increasing 'i'
        count += substringCount(str, start, i + 1, newString);

        return count;
    }

    public static int countAllSubstrings(String str, int start) {
        // Base case: If the start index reaches the end, stop recursion
        if (start == str.length()) {
            return 0;
        }

        // Count substrings starting from `start`
        int count = substringCount(str, start, start, "");

        // Move to the next starting index
        count += countAllSubstrings(str, start + 1);

        return count;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int totalCount = countAllSubstrings(str, 0);
        System.out.println("Total count: " + totalCount);
    }
}
