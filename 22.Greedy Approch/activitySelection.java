import java.util.ArrayList;

public class activitySelection {
    public static int activityCount(int[] st, int[] et){
        int maxAct = 0; //at start the max  activity selected was 0
        ArrayList<Integer> ans = new ArrayList<>(); //stores index of activity selected

        maxAct = 1; //we directly take the first ending activity
        ans.add(0); 
        int endAct = et[0];

        for(int i=0 ; i< et.length; i++){
            if(st[i] >= endAct){
                maxAct++;
                ans.add(i);
                endAct = et[i];
            }
        }
        System.out.println("taken activities are :"+ans);
        return maxAct; 
    }
    public static void main( String args[]){
        int[] startTime = {10, 12, 20};
        int[] endTime = {20, 25, 30};
        System.out.println(activityCount(startTime, endTime));

        
    }
}