public class insertionSort {
    public static void InsertionSort(int arr[]){
        for( int i=1 ; i<arr.length ; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        
    }
}