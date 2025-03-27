
import java.util.ArrayList;

public class swapNumbers {
    public static void swapNumber(ArrayList<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < 10 ; i++){
            list.add(i);
        }
        swapNumber(list, 0, 9);
        System.out.println(list);
    }
}