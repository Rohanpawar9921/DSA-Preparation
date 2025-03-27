
import java.util.Scanner;

public class operations {

    public static int getBit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and place on which we have to find bit : ");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int setBit(int n, int i){
        int bitmask = 1<<i;
        return (n | bitmask);
    }
    public static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }
    public static int updateBit(int n, int i, int newBit){
        // if (newBit == 0){
        //     return clearBit(n, i);
        // }else{
        //     return setBit(n, i);
        // }
        n = clearBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static int clearIBits(int n, int i){
        int bitmask = (~0) << i;
        return  n & bitmask;
    }

    public static int clearRangeOfBits(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitmask= a | b;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int n){
        return ((n & (n-1)) == 0);
    }

    public static int countSetBit(int n){
        int count = 0;
        while ( n > 0){
            if ((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExponentiation(int a, int n){
        int ans = 1;

        while (n > 0){
            if ((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }

        return  ans;
    }

    public static void main(String[] args) {
        //System.out.print("Ith bit is : "+ getBit());
        //System.out.print("bit is set and new value is : "+ setBit(10, 2));
        //System.out.print("bit is cleared and new value is : "+ clearBit(10, 1));
        //System.out.println(updateBit(10, 2, 1));
        //System.out.print(clearIBits(15, 2));
        //System.out.print(clearRangeOfBits(10, 2, 4));
        //System.out.println(isPowerOfTwo(16));
        //System.out.println(countSetBit(10));
        System.out.println(fastExponentiation(3, 5));
    }
}
