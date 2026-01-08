package OOPs.Interface;

public class Interface_demo{
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        ChessPlayer ch = new King();
        ch.moves();
    }
}

interface ChessPlayer {
    void moves();
}

interface Chess {
    void hello();
}

class Queen implements ChessPlayer, Chess{
    
    @Override
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
    }
    
    @Override
    public void hello() {
        System.out.println("Hello");
    }

}

class Rook implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("Up, down, left, right");
    }
}

class King implements ChessPlayer{
    @Override
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }

    public void kingMethod(){
        System.out.println("King Method");
    }
}