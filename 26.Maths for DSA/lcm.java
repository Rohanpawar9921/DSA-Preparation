public class lcm {
    public static void main(String[] args) {
        int a = 20;
        int b = 28;
        int product = a * b;
        while(a > 0 && b > 0) {
            if(a > b) { a = a % b;}
            else { b = b % a;}
        }
        if( a == 0) {
            System.out.println("gcd is "+b +", lcm is "+ +(product / b));
        }else {
            System.out.println("gcd is "+a +", lcm is "+ (product / a));
        }
    }
}
