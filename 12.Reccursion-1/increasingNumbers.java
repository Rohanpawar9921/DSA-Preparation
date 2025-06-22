public class increasingNumbers {
    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n + " ");
            return ;
        }
        printIncreasing(n-1);
        System.out.println(n + " ");
        
    }
    public static void main(String[] args) {
        printIncreasing(10);
    }
}
