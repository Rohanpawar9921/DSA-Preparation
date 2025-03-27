public class searchInRotetedArrayIterative {
    public static int search(int arr[], int target, int si, int ei){
        while(si <= ei){
            //kam 
            int mid = si + (ei - si)/2;

            //case 1
            if(arr[mid] == target){
                return mid;
            }
            //case 2 - left line
            if(arr[si] <= arr[mid]){
                if(arr[si] <= target && target <= arr[mid]){
                    ei = mid - 1;
                }
                else {
                    si = mid + 1;
                }
            } //case 3 - right side
            else {
                if(arr[mid] <= target && target <= arr[ei]){
                    si = mid + 1;
                }
                else {
                    ei = mid - 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6,7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
