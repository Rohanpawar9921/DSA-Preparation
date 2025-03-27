public class mergeSort{
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int[] arr, int si, int ei){

        //base case
        if(si >= ei){
            return;
        }
        //kam

        int mid  = si + (ei - si)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei - si + 1 ]; // if first is 0-3 and second is 4-6 the temp array required will be 7 so, 
                                            //6-0+1 = 7
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for (i=si, k=0 ; k<temp.length; i++,k++){
            arr[i] = temp[k];
        }

    }


    public static void main(String[] args) {
        int arr[] = {8, 3, 5, 2, 7, 3, 1, 0};
        sort(arr, 0, arr.length-1);
        printArray(arr);
    }
}