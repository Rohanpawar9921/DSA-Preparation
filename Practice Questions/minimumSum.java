import java.util.Arrays;
import java.util.Collections;


public class minimumSum {
    public static void main(String[] args) {
        Integer arr1[] = {4, 1, 6};
        Integer arr2[] = {3, 1, 2};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        int result = 0;
        for(int i=0; i<arr1.length;i++) {
            result += arr1[i]*arr2[i];
        }

        System.out.println(result);
    }
}