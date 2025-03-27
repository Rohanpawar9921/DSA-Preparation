public class countingSort {
    //when max element is less and length also is less and all elements are generally positive
    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i=0 ; i<arr.length ; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[]= new int[largest+1];
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        counting(arr);
        for (int i = 0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
