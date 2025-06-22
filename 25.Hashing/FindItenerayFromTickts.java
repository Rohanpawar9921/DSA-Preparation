
import java.util.HashMap;

public class FindItenerayFromTickts {

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String from: tickets.keySet()){
            revMap.put(tickets.get(from), from);
        }
        for(String to: tickets.keySet()){
            if(!revMap.containsKey(to)){
                return to;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("chennai", "benglore");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);

        System.out.println(start);
        for(String from: tickets.keySet()){
            System.out.println(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
    }
}
