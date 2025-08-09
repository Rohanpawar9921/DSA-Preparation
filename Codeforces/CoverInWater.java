import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        for (int j = 1; j <= n; j++) {
            String s = sc.nextLine();
            int l = s.length();
            int count = 0;
            boolean threeDotsFound = false;

            for (int i = 0; i < l; i++) {
                if (s.charAt(i) == '.') {
                    count++;

                    // Check for three consecutive dots
                    if (i + 2 < l && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                        threeDotsFound = true;
                        break;
                    }
                }
            }

            System.out.println(threeDotsFound ? 2 : count);
        }
    }
}
