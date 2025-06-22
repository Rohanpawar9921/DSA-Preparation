import java.util.*;

public class LinkedHashSetB {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        hset.add("mumbai");
        hset.add("delhi");
        hset.add("pune");

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("mumbai");
        lhset.add("delhi");
        lhset.add("pune");

        TreeSet<String> ts = new TreeSet<>();

        ts.add("mumbai");
        ts.add("delhi");
        ts.add("pune");

        System.out.println(hset); //random order - better time complexity
        System.out.println(lhset); //order maintained - complexity same, but little less
        System.out.println(ts); // sorted ( null value cant be inserted ) - complexity of log n
    }
}
