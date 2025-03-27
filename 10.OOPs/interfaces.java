public class interfaces {
    public static void main ( String args[]){
        // Queen q = new Queen();
        // q.moves();

        beer b = new beer();
        b.eatsMeat();
        b.eatsGrass();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves (){
        System.out.println("up, down, left, right, cross in all directions");
    }
}

class rook implements ChessPlayer {
    public void moves (){
        System.out.println("vertical and horizontal");
    }
}

class pown implements  ChessPlayer {
    public void moves(){
        System.out.println("one place straight");
    }
}

interface Harbivorous {
    void eatsGrass();
}
interface Carnivourous {
    void eatsMeat();
}

class beer implements Harbivorous, Carnivourous {
    public void eatsGrass (){
        System.out.println("eats grass");
    }
    public void eatsMeat(){
        System.out.println("eats meat");
    }
}