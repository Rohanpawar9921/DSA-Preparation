import java.util.*;
public class alexReadingProblem {
    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 1};
        int h = 5;

        Arrays.sort(arr);

        int sum = 0;
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(sum > h) {
                System.out.println(result);
                break;
            }
            result++;
        }
    }
}
