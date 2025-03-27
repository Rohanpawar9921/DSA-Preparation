public class searchInRotededArray {
    public static int search(int[] arr, int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }
        //kam
        int mid = si + (ei - si)/2;

        //case 1
        if (arr[mid] == target){
            return mid;
        }

        //line 1
        if(arr[si] <= arr[mid]){
            // case a - in left side of line 1
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            } //case b - in right side of line 2
            else {
                return search(arr, target, mid+1, ei);
            }
        } //line 2
         else {
            //case c - right side of line 2
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            } //case d - left side of line 2
            else {
                return search(arr, target, si, mid-1);
            }
         }
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6,7, 0, 1, 2};
        int target = 8;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
