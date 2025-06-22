public  class digitsInNumber {
    public static void main(String[] args) {
        int count = 0;
        int sumOfDigits = 0;
        int n = 3586;
        while(n != 0){
            System.out.print(n%10 + ", ");
            sumOfDigits += n % 10;
            count++;
            n = n/10;
        }
        System.out.println("\n count = "+ count);
        System.out.println("sum of digits is = "+ sumOfDigits);
        
    }
}