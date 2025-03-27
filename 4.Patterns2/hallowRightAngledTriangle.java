import java.util.Scanner;

public class hallowRightAngledTriangle {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n :");

        int n = sc.nextInt();

        for (int i=0 ; i <=n ; i++){
            for (int j=0 ; j<=i ; j++) {
                if (i==0 || j == 0 || i == n || i == j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}