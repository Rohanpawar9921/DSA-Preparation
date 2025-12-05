public class fibo {
    public static int recu (int n) {
        if (n == 0 ) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return recu (n-1) + recu(n-2);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(recu(6));

    }
}
