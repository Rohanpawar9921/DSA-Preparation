import java.util.Scanner;

public class comlexOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first complex number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the second complex number : ");
        int c = sc.nextInt();
        int d = sc.nextInt();

        Complex operations = new Complex();

        operations.sum(a, b, c, d);
        operations.diff(a, b, c, d);
        operations.product(a, b, c, d);

    }
}

class Complex {

    void sum(int a, int b, int c, int d){
        System.out.println("sum is : "+ (a+c) + " + " + (b+d) + "i" );
    }
    void diff(int a, int b, int c, int d){
        System.out.println("diff is : "+ (a-c) + " + " + (b-d) + "i" );
    }
    void product(int a, int b, int c, int d){
        int real = a*c - b*d;
        int complex = a*d + b*c;
        System.out.println("product is : " + real + " + " + complex + "i" );
    }


}