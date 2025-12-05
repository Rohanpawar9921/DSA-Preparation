public class sumoffirstn {
    public static int sum (int n) {
        if (n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(10));

    }
}
