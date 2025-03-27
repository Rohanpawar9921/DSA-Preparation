public class prefixArrayMaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int maxSum = Integer.MIN_VALUE;
        int currSum; 
        int prefix[] = new int[arr.length];
        
        prefix[0]= arr[0];
        //calculate preffix array
        for (int i=1 ; i < prefix.length ; i++) {
            prefix[i] = prefix[i-1] + arr[i];

        }
        for (int i = 0; i < arr.length ; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];

                if (currSum >= maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum is : "+maxSum);
    }
}
