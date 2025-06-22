import  java.util.*;

public class activitySelection {
    public static int activityCount(int[] st, int[] et){

        //sorting
        int activities[][] = new int[st.length][3];
        for(int i=0; i<st.length; i++) {
            activities[i][0] = i;
            activities[i][1] = st[i];
            activities[i][2] = et[i];
        }

        //lambda function short form
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time basis sort
        int maxAct = 0; //at start the max  activity selected was 0


        ArrayList<Integer> ans = new ArrayList<>(); //stores index of activity selected

        maxAct = 1; //we directly take the first ending activity
        ans.add(activities[0][0]); 
        int endAct = activities[0][2];

        for(int i=0 ; i< et.length; i++){
            if(activities[i][1] >= endAct){
                maxAct++;
                ans.add(activities[i][0]);
                endAct = activities[i][2];
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