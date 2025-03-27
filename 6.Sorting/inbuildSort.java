import java.util.*;

public class inbuildSort {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2}; //Integer declaration should be there as the reverseorder function only apply on the object
        Arrays.sort(arr, 0, 2); //Arrays.sort(arr, si, ei) <- ei does not include
        //Arrays.sort(arr,si, ei, Collections.reverseOrder()) // reverse sorting <- comes in collections in the util package
        for (int i = 0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
