public class sumOfFirstNnatural {
    static int printSum(int n){
        if (n == 0){
            return 0;
        }
        int sum = n + printSum(n - 1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(printSum(5));
    }
}
