public class firstOccurence {
    static int occurence(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return occurence(arr, i+1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(occurence(arr, 0, 8));
    }
}
