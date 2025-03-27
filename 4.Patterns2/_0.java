public class _0{
    public static void main(String[] args) {
        int n = 5;
        
        // for (int i = 0; i <= 5; i++) {
        //     boolean a = true;
        //     for (int j = 0; j <= i ; j++) {
        //         if ((i%2 == 0)){
        //             if (a) {
        //                 System.out.print("1");
        //             }else{
        //                 System.out.print("0");
        //             }
        //         }
        //         else{
        //             if (!a) {
        //                 System.out.print("1");
        //             }else{
        //                 System.out.print("0");
        //             }
        //         }
        //         a = !a;
                
        //     }
        //     System.out.println();
        // }


        //or

        for (int i=1; i<=n ; i++) {
            for (int j=1; j<=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
