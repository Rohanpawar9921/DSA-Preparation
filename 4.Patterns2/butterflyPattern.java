public class butterflyPattern {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n/2; i++) {
            for (int j = 1; j <= n; j++){
                if (j > (n-i) || j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n/2 ; i >=  1 ; i-- ){
            for (int j = 1; j <= n ; j++) {
                if (j > (n-i) || j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
