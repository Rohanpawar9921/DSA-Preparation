public class convertToEnglish {
    public static void printInEnglish(String year, int i){
        //base case
        if (i == year.length()){
            return;
        }
        char ch = year.charAt(i);
        //kam
        switch (ch) {
            case '1' :
                System.out.println("one");
                break;
            case '2' :
                System.out.println("two");
                break;
            case '3' :
                System.out.println("three");
                break;
            case '4' :
                System.out.println("four");
                break;
            case '5' :
                System.out.println("five");
                break;
            case '6' :
                System.out.println("six");
                break;
            case '7' :
                System.out.println("seven");
                break;
            case '8' :
                System.out.println("eight");
                break;
            case '9' :
                System.out.println("nine");
                break;
            default:
                System.out.println("wrong input");
        }
        printInEnglish(year, i+1);
    }
    public static void main(String[] args) {
        String year = "1947";
        printInEnglish(year, 0);
    }
}
