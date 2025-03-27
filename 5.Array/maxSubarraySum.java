public class maxSubarraySum {
    public static void main(String[] args) {
        int maxSum = Integer.MIN_VALUE;
        int sum;
        int total = 0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+",");
                    sum += arr[k];
                }
                if (sum >= maxSum) {
                    maxSum = sum;
                }
                System.out.print("   ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : "+total);
        System.out.println("Max subarray sum is : "+maxSum);
    }
}
