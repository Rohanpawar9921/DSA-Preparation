public class occurences {

    public static void PrintOccurences(int[] arr, int key, int i){

        if (i == arr.length) {
            return;
        }
        //kam
        if (arr[i] == key){
            System.out.println(i + " ");
        }
        PrintOccurences(arr, key, i+1);
    }
    public static void main( String[] args)
    {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        PrintOccurences(arr, key, 0);
    }
}