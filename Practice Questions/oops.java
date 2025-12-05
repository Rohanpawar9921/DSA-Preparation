import java.util.*;

class Animal {
    String name;

    public void getName () {
        System.out.println("the name is : "+this.name);
    } 
}

public class oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name you want to print: ");
        String name = sc.next();
        Animal a = new Animal();
        a.name = name;
        a.getName();
    }
}