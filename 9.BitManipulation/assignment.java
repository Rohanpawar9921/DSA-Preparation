public class assignment {

    public static int XORToSelf(int x){
        return x^x;  
    }

    public static void swapNumbers(int a, int b){
        System.out.println("before swapping a and b are : "+ a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swapping a and b are : "+ a + " " + b);

        //using arithmatics just
        System.out.println("before swapping a and b are : "+ a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping a and b are : "+ a + " " + b);
        
    }

    static int addOne(int x){
        x = -(~x);
        return x;
    }

    static void convertToLowercase(){
        for (char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.print((char) (ch | ' '));
        }
        return;
    }
    public static void main(String[] args) {
        //System.out.print(XORToSelf(10));
        //swapNumbers(1, 2);
        System.out.println(addOne(99));
        convertToLowercase();
    }
}
