public class decreasingNumbers {
    static void printDecreaing(int n ){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printDecreaing( n - 1);

    }
    public static void main(String[] args) {
        printDecreaing(10000);
    }
}