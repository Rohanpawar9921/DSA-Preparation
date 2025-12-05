public class reverseNumberRecursive {
    public static int reverse(int n, int res) {
        if (n == 0) return res;

        res = (res * 10) + (n % 10);

        return reverse(n/10, res);
    }
    public static void main(String[] args) {
        int n = 123;

        System.out.println(reverse(n, 0));
    }
}
