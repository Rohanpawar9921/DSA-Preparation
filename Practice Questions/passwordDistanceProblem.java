public class passwordDistanceProblem {
    public static int max(String s, int a, int b) {
        if (a > b) return 0;
        if(s.charAt(a) != s.charAt(b)) {
            return b - a;
        }
        
        int max = Integer.max( Integer.max(max(s, a+1, b) , max(s, a, b-1)), max(s, a+1, b-1));
        return max;
    }
    public static void main(String[] args) {
        String s = "abc10";
        System.out.println(max(s, 0, s.length()-1));
        
    }
}
