import java.util.*;

public class hashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //insertion => O(1)
        hm.put("India", 100);
        hm.put("china", 120);
        hm.put("pakistan", 30);

        //print
        System.out.println(hm);

        //search => O(1)
        int indiaPopulation = hm.get("India");
        System.out.println(indiaPopulation);
        
        System.out.println(hm.get("bhutan")); //hash map returns the null value if there is not key found

        //contains
        System.out.println(hm.containsKey("India")); //returns boolean   
        
        //remove
        System.out.println(hm.remove("pakistan")); //returns null if not found

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}