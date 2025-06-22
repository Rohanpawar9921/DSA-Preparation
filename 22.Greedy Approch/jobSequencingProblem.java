
import java.util.ArrayList;
import java.util.Collections;

public class jobSequencingProblem {
    static class Job {
        int id;
        int profit;
        int deadLine; 

        Job (int i, int d, int p) {
            this.id = i;
            this.profit = p;
            this.deadLine = d;
        }

    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> sequence = new ArrayList<>();
        
        int time = 0;

        for(int i=0; i<jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadLine > time) {
                sequence.add(curr.id);
                time++;
            }
        }

        System.out.println("Max jobs : "+ sequence.size());
        for(int i=0; i<sequence.size(); i++) {
            System.out.println(sequence.get(i) + " ");
        }




    }
}
