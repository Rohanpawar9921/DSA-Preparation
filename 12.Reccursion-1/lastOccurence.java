public class lastOccurence {
    static int occurence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }

        int isFound = occurence(arr, i+1, key);

        if( isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2,4,6,34,2};
        System.out.println(occurence(arr, 0, 1));
    }
}
