
import java.util.Scanner;

public class oddOrEven {

    public static String oOrE(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the number to check if it is even or odd : ");
            int n = sc.nextInt();
            System.out.println("Number you entered is : "+ oOrE(n));
            
            System.out.println("\n do you want to continue (y/n) :");
            String c = sc.next();

            if (c.equals("n")){
                break;
            }

        }
    }
}