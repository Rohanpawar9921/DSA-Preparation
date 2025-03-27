

public class towerOfHonoi {
    public static void steps(int n, String src, String helper, String des){
        //base case
        if (n == 1){
            System.out.println("transfer disk "+n+" from "+ src +" to "+des);
            return;
        }


        //kam
        steps(n-1, src, des, helper);
        System.out.println("transfer disk "+n+" from "+ src +" to "+des);
        steps(n-1, helper, src, des);
    }
    public static void main(String[] args) {
        int n = 64;
        steps(n, "s", "h", "d");
    }
}
