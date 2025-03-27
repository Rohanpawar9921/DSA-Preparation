import java.util.ArrayList;

public class pairsum2 {
    public static void pairSum(ArrayList<Integer> list, int target){
        int n = list.size();
        int RP, LP;
        int j = -1;
        for (int i=0; i< n; i++){
            if(list.get(i) > list.get(i+1)){
                j = i;
                break;
            }
        }
        RP = j;
        LP = j+1;
        while(LP != RP){
            if((list.get(RP) + list.get(LP)) == target){
                System.out.println(list.get(RP) + " " + list.get(LP));
                return;
            }
            if((list.get(RP) + list.get(LP)) < target){
                LP = (LP + 1) % n; //imp
            }else {
                RP = (n + RP - 1) % n; //imp
            }
        }

        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        pairSum(list, target);
    }
}
