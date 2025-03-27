public class abstraction {
    public static void main (String args[]){
        horse h = new horse();
        h.eats();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        

        chiken c = new chiken();
        c.eats();
        c.walk();
    }
}
abstract class Animal {
    String color;

    Animal(){ //constructor - sets initial value of color as brown  
        color = "brown";
    }
    void eats(){
        System.out.println("this animal eats");
    }
    abstract void walk();
}

class horse extends  Animal{
    void changeColor(){
        System.out.println("changing color");
        color = "pink";
    }
    void walk(){
        System.out.println("horse walk on two legs");
    }

}

class chiken extends Animal {
    void walk (){
        System.out.println(
            "chiken walks on 2 legs"
        );
    }
}