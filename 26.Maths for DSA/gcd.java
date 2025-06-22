public class gcd { //Euclid Algo
    public static void main(String[] args) {
        int a = 20;
        int b = 28;
        while(a > 0 && b > 0){
            if(a > b) {
                a = a % b;
            }else {
                b = b % a;
            }
        }
        if(a == 0) {
            System.out.println("gcd is : "+b);
        }
        if(b == 0) {
            System.out.println("gcd is : "+a);
        }

        System.out.println("gcd by rec : if a = 20, b = 28 : "+ gcdRec(20, 28));
        
    }
    public static int gcdRec(int a , int b){
        if(b == 0) return a;
        return gcdRec(b, a % b);
    }
}