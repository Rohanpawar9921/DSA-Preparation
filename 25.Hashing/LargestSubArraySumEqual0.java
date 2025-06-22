import java.util.HashMap;

public class LargestSubArraySumEqual0 { //o(n)
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        int sum = 0;
        int len = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j=0; j < n; j++){
            sum+= arr[j];
            if(map.containsKey(sum)){
                len = Math.max(j, j- map.get(sum));
            }
            else{
                map.put(sum, j);
            }
        }

        System.out.println("max subarray sum equal is 0 is : "+ len);



    }
}
