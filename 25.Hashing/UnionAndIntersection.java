
import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        //union
        for(int i=0; i< arr1.length; i++){
            union.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            union.add(arr2[i]);
        }


        //intersection
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            intersection.add(arr1[i]);
        }

        for(int i=0; i<arr2.length;i++){
            if(intersection.contains(arr2[i])) {
                count++;
                intersection.remove(arr2[i]);
            }
        }

        System.out.println("union = "+ union.size());
        System.out.println("Intersection ="+count);
    }
}
