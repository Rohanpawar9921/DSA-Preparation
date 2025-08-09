import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int dots = 0;
            boolean has3 = s.contains("...");
            for (char c : s.toCharArray())
                if (c == '.') dots++;
            System.out.println(has3 ? 2 : dots);
        }
    }
}
