
import java.util.HashMap;
import java.util.Set;

public class IterationOnHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("bhutan", 1);
        hm.put("indonesia", 6);
        hm.put("nepal", 6);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = "+ k+ ", value = "+hm.get(k));
        }

        System.out.println(hm.entrySet());
    }
}
