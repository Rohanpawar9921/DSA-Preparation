class Main {
    // Recursive function to reverse a string
    public static String reverse(String str) {
        // Base case: if string is empty or has one character
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case: reverse rest of the string and append first char at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String s = "Rohan";
        String reversed = reverse(s);
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reversed);
    }
}
