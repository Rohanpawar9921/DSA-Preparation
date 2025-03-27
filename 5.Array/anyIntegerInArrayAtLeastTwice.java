import java.util.*;
public class anyIntegerInArrayAtLeastTwice {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6, 1};

        Arrays.sort(arr1);
        
        for ( int i = 0; i< arr1.length ; i++) {
            if (arr1[i] == arr1[i+1]) {
                System.out.println("True");
                return;
                
            }
        }
        System.out.print("false");
    }
    


}
