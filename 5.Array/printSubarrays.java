public class printSubarrays {
    public static void main(String[] args) {
        int total = 0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+",");
                }
                System.out.print("   ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays are : "+total);
    }
}

