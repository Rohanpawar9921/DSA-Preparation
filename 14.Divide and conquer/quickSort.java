public class quickSort {
    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void sort(int[] arr, int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //kam
        int pIdx = partition(arr, si, ei);
        sort(arr, si, pIdx-1);
        sort(arr, pIdx+1, ei);
    }
    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si ; j<ei; j++){
            if(arr[j] <= pivot ){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
    public static void main(String[] args) {
        int arr[] = {7, 4, 3, 2, 5, 3, 5, 3, 7,7 ,5,3};
        sort(arr, 0, arr.length-1);
        printArray(arr);

    }
}
