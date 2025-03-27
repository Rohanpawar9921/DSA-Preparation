
import java.util.Scanner;

public class basicOperations {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the all 9 matrix elements : ");

        for (int i=0 ; i<= 2; i++){
            for (int j=0; j<= 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.err.println("Your matrix : ");

        for (int i=0 ; i<= 2; i++){
            for (int j=0; j<= 2; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.err.println("");
        }

        System.out.println("Enter the element to find in you matrix : ");
        int target = sc.nextInt();

        for (int i=0 ; i<= 2; i++){
            for (int j=0; j<= 2; j++) {
                if (arr[i][j] == target) {
                    System.err.println(arr[i][j] + "Found at "+"("+i+", "+j+")");
                    break;
                }    
            }
        }

        System.out.println("smallest and largest elements are : ");

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i=0 ; i<= 2; i++){
            for (int j=0; j<= 2; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }    
            }
        }
        System.out.print("smallest = "+smallest +", largest = "+ largest);
    }
}